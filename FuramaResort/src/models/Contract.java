package models;

public class Contract {
    private int numberOfContract; // Số hợp đồng
    private String idOfBooking; // Mã booking
    private double preDeposit; // Số tiền cọc trước
    private double totalPayment; // Tổng số tiền thanh toán
    private String idOfCustomer; // Mã khách hàng

    public Contract(int numberOfContract, String idOfBooking, double preDeposit, double totalPayment, String idOfCustomer) {
        this.numberOfContract = numberOfContract;
        this.idOfBooking = idOfBooking;
        this.preDeposit = preDeposit;
        this.totalPayment = totalPayment;
        this.idOfCustomer = idOfCustomer;
    }

    public int getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(int numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public String getIdOfBooking() {
        return idOfBooking;
    }

    public void setIdOfBooking(String idOfBooking) {
        this.idOfBooking = idOfBooking;
    }

    public double getPreDeposit() {
        return preDeposit;
    }

    public void setPreDeposit(double preDeposit) {
        this.preDeposit = preDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }
}
