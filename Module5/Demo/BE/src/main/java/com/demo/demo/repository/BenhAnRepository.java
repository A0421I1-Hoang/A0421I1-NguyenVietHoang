package com.demo.demo.repository;

import com.demo.demo.model.BenhAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenhAnRepository extends JpaRepository<BenhAn , Integer> {
    List<BenhAn> getBenhAnByMaBenhAn(String maBenhAn);

    List<BenhAn> getBenhAnByMaBenhNhan(String maBenhNhan);
}