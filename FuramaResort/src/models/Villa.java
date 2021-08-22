package models;

public class Villa extends Facility {
    private String rateRoom; // Tiêu chuẩn phòng
    private double poolAre; // Diện tích hồ bơi
    private int numberFloor; // Số tầng

    public Villa(String nameService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, String rateRoom, double poolAre, int numberFloor) {
        super(nameService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.rateRoom = rateRoom;
        this.poolAre = poolAre;
        this.numberFloor = numberFloor;
    }

    public String getRateRoom() {
        return rateRoom;
    }

    public void setRateRoom(String rateRoom) {
        this.rateRoom = rateRoom;
    }

    public double getPoolAre() {
        return poolAre;
    }

    public void setPoolAre(double poolAre) {
        this.poolAre = poolAre;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
