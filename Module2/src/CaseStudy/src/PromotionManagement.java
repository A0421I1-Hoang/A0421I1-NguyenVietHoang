import java.util.Scanner;

public class PromotionManagement {
    public PromotionManagement(){
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers get voucher");
        System.out.println("3. Return main menu");
        number=sc.nextInt();
        switch (number){
            case 3: new DisplayMainMenu(); break;
        }
    }
}