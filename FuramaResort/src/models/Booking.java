package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking implements Comparable<Booking> {
    private String idOfBooking; // Mã booking
    private String startDate; // Ngày bắt đầu
    private String endDate; // Ngày kết thúc
    private String idOfCustomer; // Mã khách hàng
    private String nameOfServices; // Tên dịch vụ
    private String idOfServices; // Loại dịch vụ

    public Booking(String idOfBooking, String startDate, String endDate, String idOfCustomer, String nameOfServices, String idOfServices) {
        this.idOfBooking = idOfBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idOfCustomer = idOfCustomer;
        this.nameOfServices = nameOfServices;
        this.idOfServices = idOfServices;
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

    public String getIdOfServices() {
        return idOfServices;
    }

    public void setIdOfServices(String idOfServices) {
        this.idOfServices = idOfServices;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idOfBooking='" + idOfBooking + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idOfCustomer='" + idOfCustomer + '\'' +
                ", nameOfServices='" + nameOfServices + '\'' +
                ", idOfServices ='" + idOfServices + '\'' +
                '}';
    }

    @Override
    public int compareTo(Booking o) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (sdf.parse(this.getStartDate()) == sdf.parse(o.getStartDate())) {
                return (sdf.parse(this.getEndDate()).compareTo(sdf.parse(o.getEndDate())));
            } else if (sdf.parse(this.getStartDate()).compareTo(sdf.parse(o.getStartDate())) > 0) {
                return 1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
