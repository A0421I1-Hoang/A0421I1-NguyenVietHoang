package bai_tap.loop_in_java;

import java.util.Scanner;

public class hienThiSoNguyenToNhoHon100 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Nhap so luong so nguyen to can nhap: ");
        number=scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
