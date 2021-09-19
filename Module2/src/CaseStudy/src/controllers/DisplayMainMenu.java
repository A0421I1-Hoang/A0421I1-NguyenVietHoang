package controllers;

import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class DisplayMainMenu {

    public static void displayMainMenu(){
        int number;
        boolean check =true;
        while (check){
        System.out.println("Welcome to Furama resort");
        System.out.println("Please choose one of the following options");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management ");
        System.out.println("4. Booking Managerment");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
            switch (number){
                case 1: displayEmployeeMenu(); break;
                case 2: displayCustomerMenu(); break;
                case 3: displayFacilityMenu(); break;
                case 4: displayBookingMenu(); break;
                case 5: displayPromotionMenu(); break;
                case 6: System.exit(0);
            }
        }
    }

    public static void displayEmployeeMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            int number;
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            switch (number) {
                case 1: employeeService.display(); break;
                case 2: employeeService.addNow(); break;
                case 3: employeeService.edit(); break;
                case 4: displayMainMenu();break;
            }
        }
    }

    public static  void displayCustomerMenu(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check){
            int number;
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            Scanner sc =new Scanner(System.in);
            number = sc.nextInt();
            switch (number){
                case 1: customerService.display(); break;
                case 2: customerService.addNow(); break;
                case 3: customerService.edit(); break;
                case 4: displayMainMenu(); break;
            }
        }
    }

    public static void displayFacilityMenu(){
        FacilityServiceImpl facilityService=new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            int number;
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            switch (number) {
                case 1: facilityService.display();break;
                case 2: addNewFacility();break;
                case 4: displayMainMenu();break;
                }
            }
        }
    public static void addNewFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            int number;
            System.out.println("1. Add new Villa");
            System.out.println("2. Add new House");
            System.out.println("3. Add new Room");
            System.out.println("4. Back to menu");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            switch (number) {
                case 1:
                    facilityService.addNewVilla(); break;
                case 2:
                    facilityService.addNewHouse();break;
                case 3:
                    facilityService.addNewRoom();break;
                case 4:
                    displayFacilityMenu();break;
                }
            }
        }


    public static  void displayBookingMenu() {
        boolean check = true;
        while (check) {
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            number = sc.nextInt();
            switch (number) {
                case 6:
                    displayMainMenu();
                    break;
            }
        }
    }

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            number = sc.nextInt();
            switch (number) {
                case 3:
                    displayMainMenu();
                    break;
            }
        }
    }
}
