package com.demo.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Entity
public class BenhNhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Không được để trống")
    private String maBenhNhan;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^[a-zA-Z]+$" , message = "Không đúng định dạng")
    private String tenBenhNhan;

    @OneToMany(mappedBy = "benhNhan")
    @JsonIgnore
    private Set<BenhAn> benhAns;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public Set<BenhAn> getBenhAns() {
        return benhAns;
    }

    public void setBenhAns(Set<BenhAn> benhAns) {
        this.benhAns = benhAns;
    }
}