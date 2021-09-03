package services.impl;

import models.Booking;
import models.Customer;
import models.Facility;
import services.IBookingService;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    Scanner scanner = new Scanner(System.in);
    private static Set<Booking> listBooking = new TreeSet<>();
    static {
        listBooking.add(new Booking("1", "12/09/2021", "16/09/2021", "1", "Booking For Villa 1", "1"));
        listBooking.add(new Booking("2", "15/09/2021", "19/09/2021", "2", "Booking For House 1", "4"));
        listBooking.add(new Booking("3", "15/09/2021", "18/09/2021", "3", "Booking For Room 1", "7"));
    }
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    @Override
    public void add() {
//        System.out.print("Enter Id of booking: ");
//        String idOfBooking = scanner.nextLine();
//        System.out.print("Enter start date (dd/MM/yyyy): ");
//        String startDate = scanner.nextLine();
//        System.out.print("Enter end date (dd/MM/yyyy): ");
//        String endDate = scanner.nextLine();
//
//        System.out.println("List of customer: ");
//        List<Customer> listCustomer = customerService.getList();
//        for (int i = 0; i < listCustomer.size(); i++) {
//            System.out.println((i+1) + ". " + "Id of customer = " + listCustomer.get(i).getIdOfCustomer() +
//                                       ", full name of customer = " + listCustomer.get(i).getFullName());
//        }
//        System.out.print("Choose customer: ");
//        int choose = Integer.parseInt(scanner.nextLine());
//        Customer customerBooking = listCustomer.get(choose - 1);
//
//        System.out.println("List of facility: ");
//        Set<Facility> mySet = facilityService.getListFacility().keySet();
//        for (Facility facility : mySet) {
//            System.out.println("Id of service = " + facility.getIdOfService() + ", name of service = " + facility.getNameOfService());
//        }
//        System.out.print("Enter id of service: ");
//        String idOfService = scanner.nextLine();
//        String idOfServiceBooking = null;
//        for (Facility facility : mySet) {
//            if (idOfService.equals(facility.getIdOfService())) {
//                idOfServiceBooking = idOfService;
//                break;
//            }
//        }
//        System.out.print("Enter name of service: ");
//        String nameOfService = scanner.nextLine();
//        listBooking.add(new Booking(idOfBooking, startDate, endDate, customerBooking.getIdOfCustomer(), nameOfService, idOfServiceBooking));
//
//        for (Facility facility : mySet) {
//            if (idOfServiceBooking.equals(facility.getIdOfService())) {
//                facilityService.getListFacility().put(facility, (facilityService.getListFacility().get(facility) + 1));
//                break;
//            }
//        }
    }

    @Override
    public void display() {
        for (Booking booking : getList()) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public List<Booking> getList() {
        return new ArrayList<>(listBooking);
    }
}
