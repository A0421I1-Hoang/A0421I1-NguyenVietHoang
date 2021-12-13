package model.bean;

public class Contract {
    private String id;
    private Booking idBooking;
    private String deposit;
    private String price;
    private Customer idCustomer;

    public Contract(){}

    public Contract(String id, Booking idBooking, String deposit, String price, Customer idCustomer) {
        this.id = id;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.price = price;
        this.idCustomer = idCustomer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Booking getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Booking idBooking) {
        this.idBooking = idBooking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", idBooking='" + idBooking + '\'' +
                ", deposit=" + deposit +
                ", price=" + price +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
