import java.util.Scanner;

public class CustomerManagement {
    public CustomerManagement(){
        int number;
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        switch (number){
            case 4: new DisplayMainMenu(); break;
        }
    }
}
