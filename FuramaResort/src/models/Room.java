package models;

public class Room extends Facility {
    private FreeServiceIncluded freeServiceIncluded; // Dịch vụ miễn phí đi kèm

    public Room(String idOfService, String nameService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, FreeServiceIncluded freeServiceIncluded) {
        super(idOfService, nameService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public FreeServiceIncluded getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(FreeServiceIncluded freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "freeServiceIncluded=" + freeServiceIncluded +
                '}';
    }
}
