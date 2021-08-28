package models;

public class Room extends Facility {
    private FreeServiceIncluded freeServiceIncluded; // Dịch vụ miễn phí đi kèm

    public Room(String nameService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, FreeServiceIncluded freeServiceIncluded) {
        super(nameService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public FreeServiceIncluded getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(FreeServiceIncluded freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }
}
