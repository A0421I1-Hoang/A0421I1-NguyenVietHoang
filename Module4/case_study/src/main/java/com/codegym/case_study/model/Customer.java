package com.codegym.case_study.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", columnDefinition = "VARCHAR(45)")
    @NotBlank(message = "wrong format")
    private String name;

    @Column(name = "birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "IdCard")
    @NotNull
    private String idCard;

    @Column(name = "email")
    @NotBlank
    private String email;

    @Column(name = "phoneNumber")
    @NotBlank
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "CustomerType_id")
    private CustomerType customerType;

    public Customer(long id, @NotBlank(message = "wrong format") String name, Date birthday, int gender, @NotNull String idCard, @NotBlank String email, @NotBlank String phoneNumber) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCard = idCard;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public Customer clone() {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setBirthday(birthday);
        customer.setGender(gender);
        customer.setIdCard(idCard);
        customer.setEmail(email);
        customer.setPhoneNumber(phoneNumber);
        customer.setCustomerType(customerType);
        return customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
