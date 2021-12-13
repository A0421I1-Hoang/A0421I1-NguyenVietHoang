package services.impl;

import models.Customer;
import services.CustomerService;
import utils.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList=new LinkedList<>();
    private static Scanner scanner =new Scanner(System.in);

    @Override
    public void display() {
        customerList= (List<Customer>) ReadAndWrite.read("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\customer.csv");
        for (Customer customer: customerList) {
            System.out.println(customer.toString());
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
        System.out.println("Nhap loai khach hang: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        Customer customer= new Customer(id, name, age, phoneNumber, CMND, email, sex, typeCustomer, address);
        customerList.add(customer);
        ReadAndWrite.write(customerList, "D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\customer.csv");
    }

    @Override
    public void edit() {
        System.out.println("Nhap id ban muon thay doi: ");
        int index =Integer.parseInt(scanner.nextLine());
        int id = index;
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
        System.out.println("Nhap loai khach hang: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        Customer customer= new Customer(id, name, age, phoneNumber, CMND, email, sex, typeCustomer, address);
        customerList.set(index-1,customer);
        ReadAndWrite.write(customerList, "D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\customer.csv");
    }

    @Override
    public void delete() {

    }
}
