package bai_lam_them_2.model;

public class Truck extends Transportation {
    private double tonnage;

    public Truck() {
    }

    public Truck(String licensePlate, String manufacturer, int yearOfManufacture, String owner, double tonnage) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "tonnage=" + tonnage +
                '}';
    }

    public String getStringToCSV () {
        return super.getString() + "," + this.tonnage;
    }
}
