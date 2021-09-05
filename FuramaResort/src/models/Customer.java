package models;

import java.util.Objects;

public class Customer extends Person implements Comparable<Customer> {
    private String idOfCustomer; // Mã khách hàng
    private CustomerType customerType; // Loại khách hàng: diamond, platinium, gold, silver, member
    private AddressOfCustomer addressOfCustomer; // Địa chỉ của khách hàng

    public Customer(String fullName, String birthday, String gender, String idCardNumber, String phoneNumber, String email, String idOfCustomer, CustomerType customerType, AddressOfCustomer addressOfCustomer) {
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

    public AddressOfCustomer getAddressOfCustomer() {
        return addressOfCustomer;
    }

    public void setAddressOfCustomer(AddressOfCustomer addressOfCustomer) {
        this.addressOfCustomer = addressOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "idOfCustomer = '" + idOfCustomer + "'" +
                ", customerType = " + customerType +
                ", addressOfCustomer = " + addressOfCustomer +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return idOfCustomer.equals(customer.idOfCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOfCustomer);
    }
}
