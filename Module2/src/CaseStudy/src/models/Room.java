package models;

import models.abstractClass.Facility;

public class Room extends Facility {
    private String free;

    public Room(){}

    private Room(String free){this.free=free;}

    public Room(String free, String name, double area, double price){
        super(name, area, price);
        this.free=free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{"+"free='" + free + '\'' +super.toString()+ '}';
    }
}
