package com.demo.demo.service;

import com.demo.demo.model.BenhNhan;
import com.demo.demo.repository.BenhNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhNhanService {
    @Autowired
    private BenhNhanRepository benhNhanRepository;

    /* get all */
    public List<BenhNhan> getAll() {
        return benhNhanRepository.findAll();
    }

    /* get benh nhan by id */
    public BenhNhan getBenhNhanById(int id) {
        return benhNhanRepository.findById(id).orElse(null);
    }

    /* update benh nhan */
    public BenhNhan updateBenhNhan(BenhNhan benhNhan) {
        return benhNhanRepository.save(benhNhan);
    }

    /* get benh nhan by name */
    public List<BenhNhan> getPatienceByName(String name) {
        return benhNhanRepository.getPatienceByName(name);
    }
}