package models;

public class House extends Facility {
    private int floor;
    private String roomStandard;

    public House(){}

    public House(int floor, String roomStandard){this.floor=floor; this.roomStandard=roomStandard;}

    public House(int id,
                 String name,
                 double area,
                 double price,
                 int peopleMax,
                 String styleRental,
                 int floor,
                 String roomStandard){
        super(id,name, area, price, peopleMax, styleRental);
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
        return "House{" +super.toString() +
                ", floor=" + floor +
                ", room standard='"+roomStandard+"\'"+'}';
    }
}
