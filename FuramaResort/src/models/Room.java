package models;

public class Room extends Facility {
    private String freeServiceIncluded; // Dịch vụ miễn phí đi kèm

    public Room(String nameService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, String freeServiceIncluded) {
        super(nameService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
