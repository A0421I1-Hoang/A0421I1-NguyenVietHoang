package com.demo.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class BenhAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Không được để trống")
    private String maBenhAn;

    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$")
    private String ngayNhapVien;

    @Pattern(regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$")
    private String ngayRaVien;

    @NotEmpty(message = "Không được để trống")
    private String lyDo;

    @NotEmpty(message = "Không được để trống")
    private String phuongPhap;

    @NotEmpty(message = "Không được để trống")
    private String bacSiDieuTri;

    @ManyToOne
    @JoinColumn(name = "maBenhNhan" , nullable = false)
    private BenhNhan benhNhan;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getPhuongPhap() {
        return phuongPhap;
    }

    public void setPhuongPhap(String phuongPhap) {
        this.phuongPhap = phuongPhap;
    }

    public String getBacSiDieuTri() {
        return bacSiDieuTri;
    }

    public void setBacSiDieuTri(String bacSiDieuTri) {
        this.bacSiDieuTri = bacSiDieuTri;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }
}