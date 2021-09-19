package models;

import models.abstractClass.Person;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    protected Employee(){}

    public Employee(int id,
                    String name,
                    int age,
                    String phoneNumber,
                    String CMND,
                    String email,
                    String sex,
                    String level,
                    String position,
                    double salary) {
        super(id, name, age, phoneNumber, CMND, email, sex);
        this.level=level;
        this.position=position;
        this.salary=salary;
    }
    public Employee(String level, String position, double salary){
        this.level=level;
        this.position=position;
        this.salary=salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} ";
    }
}
