package thuc_hanh.loop_in_java;

import java.util.Scanner;

public class tinhTienLaiChoVay {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double gui;
        double tyLe;
        int thoiHan;
        System.out.println("Nhap so tien gui: ");
        gui=scanner.nextDouble();
        System.out.println("Nhap lai suat trong 1 nam (%): ");
        tyLe=scanner.nextDouble();
        System.out.println("Nhap thoi han gui (thang): ");
        thoiHan=scanner.nextInt();
        double lai=0;
        for (int i=0;i<thoiHan;i++){
            lai +=gui*(tyLe/100)/12*thoiHan;
        }
        System.out.println("So tien lai tinh duoc la "+lai);
    }
}
