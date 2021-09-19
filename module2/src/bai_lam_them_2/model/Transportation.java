package bai_lam_them_2.model;

public abstract class Transportation {
    private String licensePlate;
    private String manufacturer;
    private int yearOfManufacture;
    private String owner;

    public Transportation() {
    }

    public Transportation(String licensePlate, String manufacturer, int yearOfManufacture, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }

    public String getString () {
        return this.licensePlate + "," + this.manufacturer + "," + this.yearOfManufacture + "," + this.owner;
    }
    public abstract void showInfo ();
}
