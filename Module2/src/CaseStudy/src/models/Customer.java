package models;

import models.abstractClass.Person;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    protected Customer() {
    }

    public Customer(int id,
                    String name,
                    int age,
                    String phoneNumber,
                    String CMND,
                    String email,
                    String sex,
                    String typeCustomer,
                    String address) {
        super(id, name, age, phoneNumber, CMND, email, sex);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String typeCustomer, String address) {
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                "}";
    }
}
