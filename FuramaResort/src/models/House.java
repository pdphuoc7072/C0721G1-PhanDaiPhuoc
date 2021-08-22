package models;

public class House extends Facility {
    private String rateRoom; // Tiêu chuẩn phòng
    private int numberFloor; // Số tầng

    public House(String nameService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, String rateRoom, int numberFloor) {
        super(nameService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.rateRoom = rateRoom;
        this.numberFloor = numberFloor;
    }

    public String getRateRoom() {
        return rateRoom;
    }

    public void setRateRoom(String rateRoom) {
        this.rateRoom = rateRoom;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
