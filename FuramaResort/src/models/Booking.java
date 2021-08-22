package models;

public class Booking {
    private String idOfBooking; // Mã booking
    private String startDate; // Ngày bắt đầu
    private String endDate; // Ngày kết thúc
    private String idOfCustomer; // Mã khách hàng
    private String nameOfServices; // Tên dịch vụ
    private String servicesOfType; // Loại dịch vụ

    public Booking(String idOfBooking, String startDate, String endDate, String idOfCustomer, String nameOfServices, String servicesOfType) {
        this.idOfBooking = idOfBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idOfCustomer = idOfCustomer;
        this.nameOfServices = nameOfServices;
        this.servicesOfType = servicesOfType;
    }

    public String getIdOfBooking() {
        return idOfBooking;
    }

    public void setIdOfBooking(String idOfBooking) {
        this.idOfBooking = idOfBooking;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdOfCustomer() {
        return idOfCustomer;
    }

    public void setIdOfCustomer(String idOfCustomer) {
        this.idOfCustomer = idOfCustomer;
    }

    public String getNameOfServices() {
        return nameOfServices;
    }

    public void setNameOfServices(String nameOfServices) {
        this.nameOfServices = nameOfServices;
    }

    public String getServicesOfType() {
        return servicesOfType;
    }

    public void setServicesOfType(String servicesOfType) {
        this.servicesOfType = servicesOfType;
    }
}
