package bai_tap.mangVaPhuongThuc;

import java.util.Scanner;

public class tinhTongCacSoOMotHangXacDinh {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Hay nhap so cot can tinh: ");
        n=sc.nextInt();
        int sum=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<2;j++){
                if (j==n){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tong cua cot can tinh la "+sum);
    }
}
