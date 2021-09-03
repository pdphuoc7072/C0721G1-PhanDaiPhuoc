package models;

public class Contract {
    private String numberOfContract; // Số hợp đồng
    private String idOfBooking; // Mã booking
    private double preDeposit; // Số tiền cọc trước
    private double totalPayment; // Tổng số tiền thanh toán
    private String idOfCustomer; // Mã khách hàng

    public Contract(String numberOfContract, String idOfBooking, double preDeposit, double totalPayment, String idOfCustomer) {
        this.numberOfContract = numberOfContract;
        this.idOfBooking = idOfBooking;
        this.preDeposit = preDeposit;
        this.totalPayment = totalPayment;
        this.idOfCustomer = idOfCustomer;
    }

    public String getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(String numberOfContract) {
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

    @Override
    public String toString() {
        return "Contract{" +
                "numberOfContract='" + numberOfContract + '\'' +
                ", idOfBooking='" + idOfBooking + '\'' +
                ", preDeposit=" + preDeposit +
                ", totalPayment=" + totalPayment +
                ", idOfCustomer='" + idOfCustomer + '\'' +
                '}';
    }
}
