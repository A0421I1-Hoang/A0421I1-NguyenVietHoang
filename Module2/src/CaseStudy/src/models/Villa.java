package models;

import models.abstractClass.Facility;

public class Villa extends Facility {
    private int floor;
    private String roomStandard;
    private double areaOfPool;

    public Villa(){}

    public Villa(int floor, String roomStandard){this.floor=floor; this.roomStandard=roomStandard;}

    public Villa(int floor, String roomStandard, String name,double areaOfPool, double area, double price){
        super(name, area, price);
        this.floor=floor;
        this.areaOfPool=areaOfPool;
        this.roomStandard=roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "floor=" + floor +", area of pool ="+areaOfPool+", room standard ='"+roomStandard+ "\'"+ super.toString() +'}';
    }
}
