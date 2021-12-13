package model.bean;

import model.bean.abstractClass.Person;

public class Customer extends Person {
    private int idLoaiKhach;
    private String address;

    protected Customer() {
    }

    public Customer(int id,
                    int idLoaiKhach,
                    String name,
                    int age,
                    String phoneNumber,
                    String CMND,
                    String email,
                    Boolean sex,
                    String address) {
        super(id, name, age, phoneNumber, CMND, email, sex);
        this.idLoaiKhach = idLoaiKhach;
        this.address = address;
    }

    public Customer(int idLoaiKhach, String address) {
        this.idLoaiKhach = idLoaiKhach;
        this.address = address;
    }

    public Customer( String name, int age, String phoneNumber, String CMND, String email, boolean sex, int idLoaiKhach, String address) {
        super( name, age, phoneNumber, CMND, email, sex);
        this.idLoaiKhach = idLoaiKhach;
        this.address = address;
    }

    public int getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(int idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
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
                ", idLoaiKhach='" + idLoaiKhach + '\'' +
                ", address='" + address + '\'' +
                "}";
    }
}
