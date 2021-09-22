package services.impl;

import models.Booking;
import models.Customer;
import models.Villa;
import models.abstractClass.Facility;
import services.BookingService;
import utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {

    static Set<Booking> bookingsSet =new TreeSet<>(new BookingComparator());

    static List<Customer> customerList= new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap= new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1,"Hoang",20,
                "0123456789","1230115464",
                "acvabes@gmail.com","nam",
                "Vip","29 Thanh Tan"));
        customerList.add(new Customer(2,"Huy",22,
                "0123454389","4253915464",
                "acfdbvabes@gmail.com","nam",
                "Vip","52 Thanh Tan"));
        customerList.add(new Customer(3,"Huyen",23,
                "0123456999","2010115464",
                "aaiwudvf1es@gmail.com","nu",
                "Vip","139 Dien Bien Phu"));
        facilityIntegerMap.put(new Villa("Villa 1",200,2000,8,"Day",2,20,"Vip"),0);
        facilityIntegerMap.put(new Villa("Villa 2",250,2200,10,"Day",2,25,"Vip"),1);
    }
    @Override
    public void display() {

    }

    @Override
    public void addNow() {
        int id=1;
        if (!bookingsSet.isEmpty()){
            id=bookingsSet.size();
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    public static Customer choseCustomer(){
        System.out.println("Danh sách khách hàng");
        for (Customer customer: customerList){
            System.out.println(customer.toString());
        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập id khách hàng");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());

        while (check){
            for (Customer customer:customerList) {
                if (id ==customer.getId()){
                    check=false;
                    return customer;
                }
            }
        }
        if (check){
            System.out.println("Bạn đã nhập sai, vui lòng nhập lại Id khách hàng");
            id=Integer.parseInt(scanner.nextLine());
        }
        return null;
    }

    public static Facility choseFacility(){
        System.out.println("Danh sách dịch vụ có sẵn");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập id dịch vụ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey())){
                    check=false;
                    return entry.getKey();
                }
            }
        }
        if (check){
            System.out.println("Bạn đã nhập sai, vui lòng nhập lại Id khách hàng");
            id=scanner.nextLine();
        }
        return null;
    }
}
