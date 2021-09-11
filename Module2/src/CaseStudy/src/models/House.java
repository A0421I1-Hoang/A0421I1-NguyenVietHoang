package models;

import models.abstractClass.Facility;

public class House extends Facility {
    private int floor;
    private String roomStandard;

    public House(){}

    public House(int floor, String roomStandard){this.floor=floor; this.roomStandard=roomStandard;}

    public House(int floor, String roomStandard, String name, double area, double price){
        super(name, area, price);
        this.floor=floor;
        this.roomStandard=roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor + ", room standard='"+roomStandard+"\'"+super.toString() +'}';
    }
}
