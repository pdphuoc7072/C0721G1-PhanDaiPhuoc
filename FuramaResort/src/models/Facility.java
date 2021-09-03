package models;

public abstract class Facility {
    private String idOfService; // Mã dịch vụ
    private String nameOfService; // Tên dịch vụ
    private double usableArea; // Diện tích sử dụng
    private double rentalCost; // Chi phí thuê
    private int maxNumberPeople; // Số lượng người tối đa
    private RentalType rentalTye; // Kiểu thuê

    public Facility(String idOfService, String nameOfService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye) {
        this.idOfService = idOfService;
        this.nameOfService = nameOfService;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxNumberPeople = maxNumberPeople;
        this.rentalTye = rentalTye;
    }

    public String getIdOfService() {
        return idOfService;
    }

    public void setIdOfService(String idOfService) {
        this.idOfService = idOfService;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public RentalType getRentalTye() {
        return rentalTye;
    }

    public void setRentalTye(RentalType rentalTye) {
        this.rentalTye = rentalTye;
    }

    @Override
    public String toString() {
        return  "idOfService = " + idOfService +
                ", nameOfService = " + nameOfService +
                ", usableArea = " + usableArea +
                ", rentalCost = " + rentalCost +
                ", maxNumberPeople = " + maxNumberPeople +
                ", rentalTye = " + rentalTye +
                '}';
    }
}
