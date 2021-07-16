package bai_tap.mangVaPhuongThuc;

import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args){
        int size;
        int[] array;
        int c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so luong mang");
        size=scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Nhập số nguyên k: ");
        int k = scanner.nextInt();
        for (c=i= 0; i < size; i++) {
            if (array[i] != k) {
                array[c] = array[i];
                c++;
            }
        }
        size=c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + k + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
