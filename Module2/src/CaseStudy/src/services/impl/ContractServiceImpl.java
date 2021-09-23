package services.impl;

import models.Booking;
import models.Contract;
import models.Customer;
import services.ContractService;
import utils.ReadAndWrite;

import java.util.*;

public class ContractServiceImpl implements ContractService {

    static List<Contract> contractList=new ArrayList<>();
    static Scanner scanner=new Scanner(System.in);
    @Override
    public void display() {
        contractList= (List<Contract>) ReadAndWrite.read("D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\contract.csv");
        for (Contract contract : contractList){
            System.out.println(contract.toString());
        }
    }

    @Override
    public void addNow() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking.toString());
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập id hợp đồng");
            String id = scanner.nextLine();
            System.out.println("Nhập số tiền trả trước: ");
            String deposit = scanner.nextLine();
            System.out.println("Nhập chi phí: ");
            String price = scanner.nextLine();

            Contract contract = new Contract(id, booking, deposit, price, customer);
            contractList.add(contract);
            ReadAndWrite.write(contractList,"D:\\A0421I1_Nguyen_Viet_Hoang\\Module2\\src\\CaseStudy\\src\\data\\contract.csv");
            System.out.println("Đã tạo hợp đồng thành công: " + contract.toString());
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
