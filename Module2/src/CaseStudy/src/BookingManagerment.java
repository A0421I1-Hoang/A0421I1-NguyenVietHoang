import java.util.Scanner;

public class BookingManagerment {
    public BookingManagerment(){
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new constracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        number= sc.nextInt();
        switch (number){
            case 6: new DisplayMainMenu(); break;
        }
    }
}
