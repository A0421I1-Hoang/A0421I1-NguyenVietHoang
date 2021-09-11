import java.util.Scanner;

public class FacilityManagement {
    public FacilityManagement(){
        int number;
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        Scanner sc= new Scanner(System.in);
        number = sc.nextInt();
        switch (number){
            case 4: new DisplayMainMenu(); break;
        }
    }
}
