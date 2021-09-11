import java.util.Scanner;

public class DisplayMainMenu {
    int number;
    public DisplayMainMenu(){
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Managerment");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        switch (number){
            case 1: new EmployeeManagement(); break;
            case 2: new CustomerManagement(); break;
            case 3: new FacilityManagement(); break;
            case 4: new BookingManagerment(); break;
            case 5: new PromotionManagement(); break;
            case 6: return;
        }
    }
}
