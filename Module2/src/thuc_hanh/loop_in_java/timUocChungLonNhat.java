package thuc_hanh.loop_in_java;

import java.util.Scanner;

public class timUocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap so thu nhat: ");
        a = input.nextInt();
        System.out.println("Nhap so thu 2: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
    }
}
