package com.codegym.repository.impl;

import com.codegym.model.Music;
import com.codegym.repository.MusicRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Transactional
public class MusicRepositoryImpl implements MusicRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Music> findAll() {
        TypedQuery<Music> query = em.createQuery("select m from music m", Music.class);
        return query.getResultList();
    }

    @Override
    public Music findById(Long id) {
        TypedQuery<Music> query = em.createQuery("select m from music m where  m.id=:id", Music.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public void save(Music model) {
        if(model.getId() != null){
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Music music = findById(id);
        if(music != null){
            em.remove(music);
        }
    }
}