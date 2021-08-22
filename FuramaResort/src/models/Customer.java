package models;

public class Customer extends Person {
    private enum CustomerType {
        DIAMOND, PLATINIUM, GOLD, SILVER, MEMBER;
    }
    private String idOfCustomer; // Mã khách hàng
    private CustomerType customerType; // Loại khách hàng
    private String addressOfCustomer; // Địa chỉ của khách hàng

    public Customer(String fullName, String birthday, Gender gender, String idCardNumber, String phoneNumber, String email, String idOfCustomer, CustomerType customerType, String addressOfCustomer) {
        super(fullName, birthday, gender, idCardNumber, phoneNumber, email);
        this.idOfCustomer = idOfCustomer;
        this.customerType = customerType;
        this.addressOfCustomer = addressOfCustomer;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddressOfCustomer() {
        return addressOfCustomer;
    }

    public void setAddressOfCustomer(String addressOfCustomer) {
        this.addressOfCustomer = addressOfCustomer;
    }
}
