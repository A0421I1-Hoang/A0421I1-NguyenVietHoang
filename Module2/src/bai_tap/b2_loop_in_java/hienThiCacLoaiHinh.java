package bai_tap.loop_in_java;

import java.util.Scanner;

public class hienThiCacLoaiHinh {
    public static void main(String[] args){
        int choice=-1;
        Scanner scanner=new Scanner(System.in);
        while (choice!=4){
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                System.out.println("**********");
                break;
            case 2:
                System.out.println("*******");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 3:
                System.out.println("    *");
                System.out.println("   ***");
                System.out.println("  *****");
                System.out.println(" *******");
                System.out.println("*********");
                break;
            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("No choice!");
            }
        }
    }
}

