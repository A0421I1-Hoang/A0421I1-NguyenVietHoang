package bai_tap;

import java.util.Scanner;

public class docSoThanhChu {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Enter number: ");
        number=scanner.nextInt();
        if (number<=10&&number>=0){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        }else {
            System.out.println("Out of ability");
        }
    }
}
