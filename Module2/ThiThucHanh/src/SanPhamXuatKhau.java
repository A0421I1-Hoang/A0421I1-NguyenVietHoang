import SanPham.SanPham;

public class SanPhamXuatKhau extends SanPham {
    private double giaXuatKhau;
    private String quocGiaNhap;

    public SanPhamXuatKhau(){}

    public SanPhamXuatKhau(double giaXuatKhau, String quocGiaNhap) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public SanPhamXuatKhau(int id, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, double giaXuatKhau, String quocGiaNhap) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return "SanPham.SanPhamXuatKhau{" + super.toString() +
                ", giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhap='" + quocGiaNhap + '\'' +
                "} " ;
    }
}
