package bai_tap.lopVaDoiTuongTrongJava.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        long a,b,c,d;
        double r1,r2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so a: ");
        a=sc.nextLong();
        System.out.println("Nhap so b: ");
        b=sc.nextLong();
        System.out.println("Nhap so c: ");
        c=sc.nextLong();
        d=b*b-4*a*c;
        if (d>0){
            r1=(-b+Math.pow(d,0.5))/(2*a);
            r2=(-b-Math.pow(d,0.5))/(2*a);
            System.out.println("The equation have two roots "+r1+" and "+r2);
        } else if (d==0){
            r1=-b/(2*a);
            System.out.println("The equation have one root "+r1);
        }else {
            System.out.println("The equation have no real roots");
        }
    }
}
