package com.demo.demo.service;

import com.demo.demo.model.BenhAn;
import com.demo.demo.repository.BenhAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenhAnService {
    @Autowired
    private BenhAnRepository benhAnRepository;

    public List<BenhAn> getAll() {
        return benhAnRepository.findAll();
    }

    public BenhAn getBenhAnById(Integer id) {
        return benhAnRepository.findById(id).orElse(null);
    }

    public BenhAn updateBenhAn(BenhAn benhAn) {
        return benhAnRepository.save(benhAn);
    }

    public List<BenhAn> getBenhAnByMaBenhAn(String maBenhAn) {
        return benhAnRepository.getBenhAnByMaBenhAn(maBenhAn);
    }

    public List<BenhAn> getBenhAnByMaBenhNhan(String maBenhNhan) {
        return benhAnRepository.getBenhAnByMaBenhNhan(maBenhNhan);
    }
}