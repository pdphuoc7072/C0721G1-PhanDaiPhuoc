package services.impl;

import models.Booking;
import models.Facility;
import services.IBookingService;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImpl implements IBookingService {
    Scanner scanner = new Scanner(System.in);
    private static Set<Booking> listBooking = new TreeSet<>();
    static {
        listBooking.add(new Booking("1", "12/09/2021", "16/09/2021", "1", "Booking - Villa 1", "1"));
        listBooking.add(new Booking("2", "15/09/2021", "19/09/2021", "2", "Booking - Villa 2", "2"));
        listBooking.add(new Booking("3", "15/09/2021", "18/09/2021", "3", "Booking - Villa 3", "3"));
    }
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();

    @Override
    public void addList() {
        System.out.print("Enter Id of booking: ");
        String idOfBooking = scanner.nextLine();
        System.out.print("Enter start date (dd/MM/yyyy): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter end date (dd/MM/yyyy): ");
        String endDate = scanner.nextLine();
        System.out.println("List of customer: ");
        for (int i = 0; i < CustomerServiceImpl.listCustomer.size(); i++) {
            System.out.println("Id of customer = " + CustomerServiceImpl.listCustomer.get(i).getIdOfCustomer() +
                                       ", full name of customer = " + CustomerServiceImpl.listCustomer.get(i).getFullName());
        }
        System.out.print("Enter Id of customer: ");
        String idOfCustomer = scanner.nextLine();
        System.out.println("List of facility: ");
        Set<Facility> mySet = FacilityServiceImpl.listFacilityService.keySet();
        for (Facility facility : mySet) {
            System.out.println("Id of service = " + facility.getIdOfService() + ", name of service = " + facility.getNameService());
        }
        System.out.print("Enter id of service: ");
        String idOfService = scanner.nextLine();
        System.out.print("Enter name of service: ");
        String nameOfService = scanner.nextLine();
        listBooking.add(new Booking(idOfBooking, startDate, endDate, idOfCustomer, nameOfService, idOfService));
        for (Facility facility : mySet) {
            if (idOfService == facility.getIdOfService()) {
                int numberOfUse = FacilityServiceImpl.listFacilityService.get(facility);
                numberOfUse++;
            }
            break;
        }
    }

    @Override
    public void displayList() {
        for (Booking booking : listBooking) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void editList() {

    }
}
