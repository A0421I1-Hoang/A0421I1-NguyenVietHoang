import java.util.Scanner;

public class EmployeeManagement {
    public EmployeeManagement() {
        int number;
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        switch (number){
            case 4: new DisplayMainMenu(); break;
        }
    }
}
