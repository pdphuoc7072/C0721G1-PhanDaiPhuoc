package bai_lam_them_3.model;

public class ElectricBill {
    private String idOfBill;
    private String idOfCustomer;
    private String invoiceDate;
    private int numberOfKW;
    private double unitPrice;
    private double amount;

    public ElectricBill() {
    }

    public ElectricBill(String idOfBill, String idOfCustomer, String invoiceDate, int numberOfKW, double unitPrice, double amount) {
        this.idOfBill = idOfBill;
        this.idOfCustomer = idOfCustomer;
        this.invoiceDate = invoiceDate;
        this.numberOfKW = numberOfKW;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public String getIdOfBill() {
        return idOfBill;
    }

    public void setIdOfBill(String idOfBill) {
        this.idOfBill = idOfBill;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getNumberOfKW() {
        return numberOfKW;
    }

    public void setNumberOfKW(int numberOfKW) {
        this.numberOfKW = numberOfKW;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ElectricBill{" +
                "idOfBill='" + idOfBill + '\'' +
                ", idOfCustomer='" + idOfCustomer + '\'' +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", numberOfKW=" + numberOfKW +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
    public String getStringToCSV () {
        return this.idOfBill + "," + this.idOfCustomer + "," + this.invoiceDate + "," + this.numberOfKW + "," + this.unitPrice + "," + this.amount;
    }
}
