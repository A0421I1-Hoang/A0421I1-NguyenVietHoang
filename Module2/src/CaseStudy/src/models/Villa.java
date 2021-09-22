package models;

import models.abstractClass.Facility;

public class Villa extends Facility {
    private int floor;
    private String roomStandard;
    private double areaOfPool;

    public Villa(){}

    public Villa(int floor, String roomStandard,double areaOfPool){this.floor=floor; this.roomStandard=roomStandard; this.areaOfPool=areaOfPool;}

    public Villa( String name,
                  double area,
                  double price,
                  int peopleMax,
                  String styleRental,
                  int floor,
                  double areaOfPool,
                  String roomStandard){
        super(name, area, price, peopleMax,styleRental);
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
        return "Villa{" +super.toString() +
                ", floor=" + floor +", area of pool ="+areaOfPool+", room standard ='"+roomStandard+ "\'"+ '}';
    }
}
