package models;

public class Room extends Facility {
    private String free;

    public Room(){}

    private Room(String free){this.free=free;}

    public Room(int id,String name, double area, double price, int peopleMax,String styleRental, String free){
        super(id,name, area, price, peopleMax, styleRental);
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
        return "Room{"+super.toString()+", free='" + free + '\'' + '}';
    }
}
