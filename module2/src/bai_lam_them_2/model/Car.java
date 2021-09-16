package bai_lam_them_2.model;

public class Car extends Transportation {
    private int numberOfSeats;
    private String vehicleOfType;

    public Car() {
    }

    public Car(String licensePlate, String manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String vehicleOfType) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleOfType = vehicleOfType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleOfType() {
        return vehicleOfType;
    }

    public void setVehicleOfType(String vehicleOfType) {
        this.vehicleOfType = vehicleOfType;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "numberOfSeats=" + numberOfSeats +
                ", vehicleOfType='" + vehicleOfType + '\'' +
                '}';
    }

    public String getStringToCSV () {
        return super.getString() + "," + this.numberOfSeats + "," + this.vehicleOfType;
    }
}
