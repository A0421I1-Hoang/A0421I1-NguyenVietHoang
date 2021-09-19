package services.impl;

import models.House;
import models.Room;
import models.Villa;
import models.abstractClass.Facility;
import services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner= new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service "+element.getKey()+"Số lần đã thuê: "+element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
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
        Villa villa=new Villa(name,area,price,peopleMax,styleRental,floor,areaOfPool,roomStandard);
        facilityIntegerMap.put(villa,0);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewHouse() {
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
        House house=new House(name,area,price,peopleMax,styleRental,floor,roomStandard);
        facilityIntegerMap.put(house,0);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void addNewRoom() {
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
        Room room=new Room(name,area,price,peopleMax,styleRental,roomStandard);
        facilityIntegerMap.put(room,0);
        System.out.println("Đã thêm mới thành công");
    }
}
