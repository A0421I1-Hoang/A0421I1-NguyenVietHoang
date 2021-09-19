package services.impl;

import models.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList=new ArrayList<>();
    private static Scanner scanner =new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee: employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNow() {
        System.out.println("Nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap CMND: ");
        String CMND = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap chuc vu: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        double salary = Integer.parseInt(scanner.nextLine());
        Employee employee= new Employee(id, name, age, phoneNumber, CMND, email, sex, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        System.out.println("Nhap id ban muon thay doi: ");
        int index= Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ID: ");
        int id = index;
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dien thoai: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap CMND: ");
        String CMND = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println("Nhap chuc vu: ");
        String level = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String position = scanner.nextLine();
        System.out.println("Nhap luong: ");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee= new Employee(id, name, age, phoneNumber, CMND, email, sex, level, position, salary);
        employeeList.set(index-1,employee);
    }

    @Override
    public void delete() {

    }
}
