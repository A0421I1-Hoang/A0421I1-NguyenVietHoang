package bai_tap;

import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        double VND,USD;
        System.out.println("Nhap vao so tien can chuyen: ");
        USD=scanner.nextDouble();
        VND=USD*23000;
        System.out.println("So tien sau khi chuyen do la "+VND);
    }
}
