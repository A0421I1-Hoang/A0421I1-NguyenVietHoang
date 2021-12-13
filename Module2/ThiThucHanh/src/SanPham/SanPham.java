package SanPham;

import java.io.Serializable;

public abstract class SanPham implements Serializable {
    private int id;
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;
    private int soLuong;
    private String nhaSanXuat;

    public SanPham(int id, String maSanPham, String tenSanPham, int giaBan, int soLuong, String nhaSanXuat, double giaXuatKhau, String quocGiaNhap){}

    public SanPham(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public SanPham(int id, String maSanPham, String tenSanPham, int giaBan, int soLuong, String nhaSanXuat, double giaNhapKhau, String tinhThanhNhap, double thueNhapKhau) {
    }

    public SanPham() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id++;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
