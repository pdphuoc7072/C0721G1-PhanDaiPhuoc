package bai_lam_them_3.model;

public class CustomerOfType {
    private String idOfCustomerOfType;
    private String customerOfType;

    public CustomerOfType() {
    }

    public CustomerOfType(String idOfCustomerOfType, String customerOfType) {
        this.idOfCustomerOfType = idOfCustomerOfType;
        this.customerOfType = customerOfType;
    }

    public String getIdOfCustomerOfType() {
        return idOfCustomerOfType;
    }

    public void setIdOfCustomerOfType(String idOfCustomerOfType) {
        this.idOfCustomerOfType = idOfCustomerOfType;
    }

    public String getCustomerOfType() {
        return customerOfType;
    }

    public void setCustomerOfType(String customerOfType) {
        this.customerOfType = customerOfType;
    }

    @Override
    public String toString() {
        return "CustomerOfType{" +
                "idOfCustomerOfType='" + idOfCustomerOfType + '\'' +
                ", customerOfType='" + customerOfType + '\'' +
                '}';
    }
    public String getStringToCSV () {
        return this.idOfCustomerOfType + "," + this.customerOfType;
    }
}
