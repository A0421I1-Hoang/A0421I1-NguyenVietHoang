package com.demo.demo.repository;

import com.demo.demo.model.BenhNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenhNhanRepository extends JpaRepository<BenhNhan , Integer> {
    List<BenhNhan> getPatienceByName(String name);
}