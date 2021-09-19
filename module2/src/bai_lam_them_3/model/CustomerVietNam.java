package bai_lam_them_3.model;

public class CustomerVietNam extends Customer {
    private String customerOfType;
    private int consumption;

    public CustomerVietNam() {
    }

    public CustomerVietNam(String idOfCustomer, String fullName, String customerOfType, int consumption) {
        super(idOfCustomer, fullName);
        this.customerOfType = customerOfType;
        this.consumption = consumption;
    }

    public String getCustomerOfType() {
        return customerOfType;
    }

    public void setCustomerOfType(String customerOfType) {
        this.customerOfType = customerOfType;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "CustomerVietNam{" +
                super.toString() +
                "customerOfType='" + customerOfType + '\'' +
                ", consumption=" + consumption +
                '}';
    }
    @Override
    public String getStringToCSV () {
        return super.getStringToCSV() + "," + this.customerOfType + "," + this.consumption;
    }
}
