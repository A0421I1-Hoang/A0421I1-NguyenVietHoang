package services.impl;

import models.House;
import models.Room;
import models.Villa;
import models.Facility;
import services.FacilityService;
import utils.ReadAndWrite;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner= new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service "+element.getKey()+"Số lần đã thuê: "+element.getValue());
        }
        facilityIntegerMap= (Map<Facility, Integer>) ReadAndWrite.read("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\villa.csv");
        facilityIntegerMap= (Map<Facility, Integer>) ReadAndWrite.read("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\house.csv");
        facilityIntegerMap= (Map<Facility, Integer>) ReadAndWrite.read("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\room.csv");
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập id: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name=scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        Double area=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        Double price=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int peopleMax=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String styleRental=scanner.nextLine();
        System.out.println("Nhap so tang: ");
        int floor=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap dien tich ho boi: ");
        double areaOfPool=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap tieu chuan cua phong: ");
        String roomStandard=scanner.nextLine();
        Villa villa=new Villa(id,name,area,price,peopleMax,styleRental,floor,areaOfPool,roomStandard);
        facilityIntegerMap.put(villa,0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\villa.csv");
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name=scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        Double area=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        Double price=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int peopleMax=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String styleRental=scanner.nextLine();
        System.out.println("Nhap so tang: ");
        int floor=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap tieu chuan cua phong: ");
        String roomStandard=scanner.nextLine();
        House house=new House(id,name,area,price,peopleMax,styleRental,floor,roomStandard);
        facilityIntegerMap.put(house,0);
        ReadAndWrite.write((Collection) facilityIntegerMap,"D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\house.csv");
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten: ");
        String name=scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        Double area=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap gia tien: ");
        Double price=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so luong nguoi: ");
        int peopleMax=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap kieu thue: ");
        String styleRental=scanner.nextLine();
        System.out.println("Nhap tieu chuan cua phong: ");
        String roomStandard=scanner.nextLine();
        Room room=new Room(id,name,area,price,peopleMax,styleRental,roomStandard);
        facilityIntegerMap.put(room,0);
        ReadAndWrite.write((Collection) facilityIntegerMap, "D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\room.csv");
        System.out.println("Đã thêm mới thành công");
    }
}
