package bai_lam_them_3.model;

public abstract class Customer {
    private String idOfCustomer;
    private String fullName;

    public Customer() {
    }

    public Customer(String idOfCustomer, String fullName) {
        this.idOfCustomer = idOfCustomer;
        this.fullName = fullName;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idOfCustomer='" + idOfCustomer + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
    public String getStringToCSV () {
        return this.idOfCustomer + "," + this.fullName;
    }
}
