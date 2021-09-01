package models;

public abstract class Facility {
    private String idOfService; // Mã dịch vụ
    private String nameService; // Tên dịch vụ
    private double usableArea; // Diện tích sử dụng
    private double rentalCost; // Chi phí thuê
    private int maxNumberPeople; // Số lượng người tối đa
    private RentalType rentalTye; // Kiểu thuê

    public Facility(String idOfService, String nameService, double usableArea, double rentalCost, int maxNumberPeople, RentalType rentalTye) {
        this.idOfService = idOfService;
        this.nameService = nameService;
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

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
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
                ", nameService = " + nameService +
                ", usableArea = " + usableArea +
                ", rentalCost = " + rentalCost +
                ", maxNumberPeople = " + maxNumberPeople +
                ", rentalTye = " + rentalTye +
                '}';
    }
}
