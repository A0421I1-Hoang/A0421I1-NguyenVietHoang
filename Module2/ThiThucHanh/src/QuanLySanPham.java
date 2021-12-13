import SanPham.SanPham;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    private static List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
    private static List<SanPhamXuatKhau> sanPhamXuatKhauList =new ArrayList<>();
    private static final Scanner scanner =new Scanner(System.in);
    public static final String REGEX_STR="[A-Z][a-z]+";
    public static final String REGEX_MASANPHAM="[ACDT]+[PRS]+[//d]{5}+";

    public static void giaoDien(){
        int choice=0;
        while (true){
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách sản phẩm");
            System.out.println("4. TÌm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng: ");
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }

            switch (choice){
                case 1: themMoiSanPham(); break;
                case 2: xoaSanPham(); break;
                case 3: danhSachSanPham(); break;
                case 4:
                    try {
                        timKiem();
                    } catch (SanPhamNotFounfException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5: System.exit(0);
            }
        }
    }

    public static void danhSachSanPham() {
        int choice = 0;
        while (true) {
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sản phẩm nhập khẩu");
            System.out.println("2. Xem danh sách sản phẩm xuất khẩu");
            System.out.println("3. Thoát");
            System.out.println("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }

            switch (choice) {
                case 1:
                    danhSachSanPhamNhapKhau();
                    break;
                case 2:
                    xoaSanPham();
                    break;
            }
        }
    }

    public static void danhSachSanPhamNhapKhau() {
        sanPhamNhapKhauList = (List<SanPhamNhapKhau>) DocVaGhi.doc("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\ThiThucHanh\\src\\File\\SanPhamNhapKhau.csv");
        if (sanPhamNhapKhauList != null) {
            for (SanPhamNhapKhau sanPham : sanPhamNhapKhauList) {
                System.out.println(sanPham.toString());
            }
        }
    }

    public static void danhSachSanPhamXuatKhau() {
        sanPhamXuatKhauList = (List<SanPhamXuatKhau>) DocVaGhi.doc("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\ThiThucHanh\\src\\File\\SanPhamXuatKhau.csv");
        if (sanPhamXuatKhauList != null) {
            for (SanPhamXuatKhau sanPham : sanPhamXuatKhauList) {
                System.out.println(sanPham.toString());
            }
        }
    }

    public static void themMoiSanPham(){
        int choice=0;
        while (true){
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Thêm mới sản phẩm nhập khẩu");
            System.out.println("2. Thêm mới sản phẩm xuất khẩu");
            System.out.println("3. Thoát ra màn hình chính");
            System.out.println("Chọn chức năng: ");
            try {
                choice =Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại");
            }
            switch (choice){
                case 1:themSanPhamNhapKhau(); break;
                case 2:themSanPhamXuatKhau(); break;
                case 3:giaoDien(); break;
            }
        }
    }

    public static void themSanPhamNhapKhau(){
        int id;
        if (sanPhamNhapKhauList.size()==0){
            id=1;
        }else {
            id = sanPhamNhapKhauList.get(sanPhamXuatKhauList.size() - 1).getId() + 1;
        }
        System.out.println("Vui long nhap ma san pham: ");
        String maSanPham=scanner.nextLine();
        System.out.println("Vui long nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Vui long nhap gia ban: ");
        int giaBan=Integer.parseInt(scanner.nextLine());
        System.out.println("Vui long nhap so luong san pham: ");
        int soLuong=Integer.parseInt(scanner.nextLine());
        System.out.println("Vui long nhap ten nha san xuat: ");
        String nhaSanXuat =scanner.nextLine();
        System.out.println("Vui long nhap gia nhap khau: ");
        double giaNhapKhau=Double.parseDouble(scanner.nextLine());
        System.out.println("Vui long nhap tinh thanh nhap: ");
        String tinhThanhNhap=scanner.nextLine();
        System.out.println("Vui long nhap thue nhap khau: ");
        double thueNhapKhau=Double.parseDouble(scanner.nextLine());
        SanPhamNhapKhau sanPhamNhapKhau =new SanPhamNhapKhau(id,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,tinhThanhNhap,thueNhapKhau);
        sanPhamNhapKhauList.add(sanPhamNhapKhau);
        DocVaGhi.ghi(sanPhamNhapKhauList,"D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\ThiThucHanh\\src\\File\\SanPhamNhapKhau.csv");
    }

    public static void themSanPhamXuatKhau(){
        int id;
        if (sanPhamXuatKhauList.size()==0){
            id=1;
        }else {
            id = sanPhamXuatKhauList.get(sanPhamNhapKhauList.size() - 1).getId() + 1;
        }
        System.out.println("Vui long nhap ma san pham: ");
        String maSanPham= scanner.nextLine();
        System.out.println("Vui long nhap ten san pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Vui long nhap gia ban: ");
        int giaBan=Integer.parseInt(scanner.nextLine());
        System.out.println("Vui long nhap so luong san pham: ");
        int soLuong=Integer.parseInt(scanner.nextLine());
        System.out.println("Vui long nhap ten nha san xuat: ");
        String nhaSanXuat =scanner.nextLine();
        System.out.println("Vui long nhap gia xuat khau: ");
        double giaXuatKhau=Double.parseDouble(scanner.nextLine());
        System.out.println("Vui long nhap quoc gia nhap: ");
        String quocGiaNhap=scanner.nextLine();
        sanPhamNhapKhauList.add(new SanPhamNhapKhau(id,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaXuatKhau,quocGiaNhap));
        DocVaGhi.ghi(sanPhamXuatKhauList,"D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\ThiThucHanh\\src\\File\\SanPhamXuatKhau.csv");
    }


    public static void xoaSanPham(){

    }
    public static void xoaSanPhamXuatKhau(){
        try {
            System.out.println("Nhap ma cua san pham ban muon xoa: ");
            String maSanPham=scanner.nextLine();

            SanPhamXuatKhau sanPham= (SanPhamXuatKhau) findByIdXK(maSanPham);
            System.out.println("Ban có chắc muốn xóa sản phẩm "+sanPham.getTenSanPham()+
                    "\n Co"+
                    "\n Khong");
            if (scanner.nextLine().equals("Co")){
                sanPhamXuatKhauList.remove(sanPham);
            } else {
                giaoDien();
            }
        }catch (SanPhamNotFounfException e){
            e.printStackTrace();
        }
        DocVaGhi.ghi(sanPhamXuatKhauList,"D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\ThiThucHanh\\src\\File\\SanPhamNhapKhau.csv");
    }
    public static void xoaSanPhamNhapKhau(){
        try {
            System.out.println("Nhap ma cua san pham ban muon xoa: ");
            String maSanPham=scanner.nextLine();

            SanPhamNhapKhau sanPham= (SanPhamNhapKhau) findByIdNK(maSanPham);
            System.out.println("Ban có chắc muốn xóa sản phẩm "+sanPham.getTenSanPham()+
                    "\n Co"+
                    "\n Khong");
            if (scanner.nextLine().equals("Co")){
                sanPhamNhapKhauList.remove(sanPham);
            } else {
                giaoDien();
            }
        }catch (SanPhamNotFounfException e){
            e.printStackTrace();
        }
        DocVaGhi.ghi(sanPhamNhapKhauList,"D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\ThiThucHanh\\src\\File\\SanPhamXuatKhau.csv");
    }

    private static SanPham findByIdNK(String maSanPham) throws SanPhamNotFounfException{
        SanPham sanPham = null;
        for (SanPham sanPham1 : sanPhamNhapKhauList) {
            if (sanPham1.getMaSanPham().equals(maSanPham)) {
                sanPham = sanPham1;
            }
        }
        if (sanPham == null){
                throw new SanPhamNotFounfException("Không có sản phẩm nào");
        }
        return sanPham;
    }

    private static SanPham findByIdXK(String maSanPham) throws SanPhamNotFounfException{
        SanPham sanPham = null;
        for (SanPham sanPham1 : sanPhamXuatKhauList) {
            if (sanPham1.getMaSanPham().equals(maSanPham)) {
                sanPham = sanPham1;
            }
        }
        if (sanPham == null){
            throw new SanPhamNotFounfException("Không có sản phẩm nào");
        }
        return sanPham;
    }

    public static class SanPhamNotFounfException extends Exception{
        public SanPhamNotFounfException(String message){
            super(message);
        }

        public SanPhamNotFounfException(){
            super("Khong tim thay san pham");
        }
    }

    public static void timKiem() throws SanPhamNotFounfException{
        SanPham sanPham= null;
        System.out.println("Nhap ma san pham ban muon tim");
        String maSanPham = scanner.nextLine();
        for (SanPham sanPham1 : sanPhamNhapKhauList) {
            if (sanPham1.getMaSanPham().equals(maSanPham)) {
                sanPham = sanPham1;
            }
        }
        if (sanPham==null){
            throw new SanPhamNotFounfException("Không có sản phẩm nào");
        }else{
            System.out.println(sanPham.toString());
        }
    }
}
