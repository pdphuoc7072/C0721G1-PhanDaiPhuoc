package models;

public class Room extends Facility {
    private FreeInclusiveService freeInclusiveService; // Dịch vụ miễn phí đi kèm

    public Room(String idOfService, String nameOfService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye, FreeInclusiveService freeInclusiveService) {
        super(idOfService, nameOfService, usableArea, rentalCost, maxNumberPeople, rentalTye);
        this.freeInclusiveService = freeInclusiveService;
    }

    public FreeInclusiveService getFreeInclusiveService() {
        return freeInclusiveService;
    }

    public void setFreeInclusiveService(FreeInclusiveService freeInclusiveService) {
        this.freeInclusiveService = freeInclusiveService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                ", freeInclusiveService = " + freeInclusiveService +
                '}';
    }
}
