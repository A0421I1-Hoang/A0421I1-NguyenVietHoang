package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.model.Condiments;

import java.util.List;

public interface CondimentsService {
    List<Condiments> findAll();

    Condiments findOne(Long id);

    Condiments save(Condiments condiments);

    List<Condiments> save(List<Condiments> condiments);

    boolean exists(Long id);

    List<Condiments> findAll(List<Long> ids);

    long count();

    void delete(Long id);

    void delete(Condiments condiments);

    void delete(List<Condiments> condiments);

    void deleteAll();
}
