package bai_lam_them_2.model;

public class Bike extends Transportation {
    private int wattage;

    public Bike() {
    }

    public Bike(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int wattage) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Bike{" +
                super.toString() +
                "wattage=" + wattage +
                '}';
    }

    public String getStringToCSV () {
        return super.getString() + "," + this.wattage;
    }
}
