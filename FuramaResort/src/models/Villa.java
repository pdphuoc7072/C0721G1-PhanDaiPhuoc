package models;

public class Villa extends Facility {
    private String rateRoom; // Tiêu chuẩn phòng
    private double poolArea; // Diện tích hồ bơi
    private int numberFloor; // Số tầng

    public Villa(String idOfService, String nameOfService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, String rateRoom, double poolArea, int numberFloor) {
        super(idOfService, nameOfService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.rateRoom = rateRoom;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getRateRoom() {
        return rateRoom;
    }

    public void setRateRoom(String rateRoom) {
        this.rateRoom = rateRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                ", rateRoom = " + rateRoom +
                ", poolArea = " + poolArea +
                ", numberFloor = " + numberFloor +
                '}';
    }
}
