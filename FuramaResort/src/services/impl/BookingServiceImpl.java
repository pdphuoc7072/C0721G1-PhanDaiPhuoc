package services.impl;

import models.*;
import services.IBookingService;
import utils.*;

import java.util.*;

public class BookingServiceImpl implements IBookingService {
    Scanner scanner = new Scanner(System.in);
    private static String filePathOfVilla = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\villa.csv";
    private static String filePathOfHouse = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\house.csv";
    private static String filePathOfRoom = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\room.csv";
    private static String filePathOfBooking = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\booking.csv";
    private static String filePathOfBookingAfterAddForContract = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\booking_after_add_for_contract.csv";
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    AllRegex allRegex = new AllRegex();

    @Override
    public void add() {
        while (true) {
            try {
                Set<Booking> bookingList = ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBooking);

                String idOfBooking;
                boolean flag;
                boolean isValidOfIdBooking;
                do {
                    flag = true;
                    do {
                        System.out.print("Enter Id of booking: ");
                        idOfBooking = scanner.nextLine();
                        isValidOfIdBooking = allRegex.validateOfBooking(idOfBooking);
                        if (!isValidOfIdBooking) {
                            System.out.println("Error. The Id of booking must be in the correct format: BKXX-YYYY");
                        }
                    }while (!isValidOfIdBooking);
                    for (Booking booking : bookingList) {
                        if (idOfBooking.equals(booking.getIdOfBooking())) {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("This id of booking already exists in the list");
                    }
                } while (!flag);

                String startDate;
                boolean isValidOfStartDate;
                do {
                    System.out.print("Enter start date (dd/MM/yyyy): ");
                    startDate = scanner.nextLine();
                    isValidOfStartDate = allRegex.validateOfDate(startDate);
                    if (!isValidOfStartDate) {
                        System.out.println("The start date must be in the correct format: dd/mm/yyyy");
                    }
                } while (!isValidOfStartDate);

                String endDate;
                boolean isValidOfEndDate;
                do {
                    System.out.print("Enter end date (dd/MM/yyyy): ");
                    endDate = scanner.nextLine();
                    isValidOfEndDate = allRegex.validateOfDate(endDate);
                    if (!isValidOfEndDate) {
                        System.out.println("The end date must be in the correct format: dd/mm/yyyy");
                    }
                } while (!isValidOfEndDate);

                System.out.println("List of customer: ");
                List<Customer> listCustomer = customerService.getList();
                for (int i = 0; i < listCustomer.size(); i++) {
                    System.out.println((i+1) + ". " + "Id of customer = " + listCustomer.get(i).getIdOfCustomer() +
                            ", full name of customer = " + listCustomer.get(i).getFullName());
                }
                System.out.print("Choose customer: ");
                int choose = Integer.parseInt(scanner.nextLine());
                Customer customerBooking = listCustomer.get(choose - 1);

                System.out.println("List of facility: ");
                Map<Villa, Integer> villaList = facilityService.getListVilla();
                Set<Villa> villaSet = villaList.keySet();
                for (Villa villa : villaSet) {
                    System.out.println("Id of service = " + villa.getIdOfService() + ", name of service = " + villa.getNameOfService());
                }
                Map<House, Integer> houseList = facilityService.getListHouse();
                Set<House> houseSet = houseList.keySet();
                for (House house : houseSet) {
                    System.out.println("Id of service = " + house.getIdOfService() + ", name of service = " + house.getNameOfService());
                }
                Map<Room, Integer> roomList = facilityService.getListRoom();
                Set<Room> roomSet = roomList.keySet();
                for (Room room : roomSet) {
                    System.out.println("Id of service = " + room.getIdOfService() + ", name of service = " + room.getNameOfService());
                }

                String idOfService;
                boolean isValidOfIdService;
                do {
                    System.out.print("Enter id of service: ");
                    idOfService = scanner.nextLine();
                    isValidOfIdService = allRegex.validateOfIdService(idOfService);
                    if (!isValidOfIdService) {
                        System.out.println("Error. The Id of service must be in the correct format: SVXX-YYYY");
                    }
                } while (!isValidOfIdService);

                String idOfServiceBooking = null;
                for (Villa villa : villaSet) {
                    if (idOfService.equals(villa.getIdOfService())) {
                        idOfServiceBooking = idOfService;
                        break;
                    }
                }
                for (House house : houseSet) {
                    if (idOfService.equals(house.getIdOfService())) {
                        idOfServiceBooking = idOfService;
                        break;
                    }
                }
                for (Room room : roomSet) {
                    if (idOfService.equals(room.getIdOfService())) {
                        idOfServiceBooking = idOfService;
                        break;
                    }
                }

                System.out.print("Enter name of service: ");
                String nameOfService = scanner.nextLine();

                bookingList.clear();
                bookingList.add(new Booking(idOfBooking, startDate, endDate, customerBooking.getIdOfCustomer(), nameOfService, idOfServiceBooking));
                ReadAndWriteFileOfBooking.writeBookingToFile(filePathOfBooking, bookingList, true);
                ReadAndWriteFileOfBooking.writeBookingToFile(filePathOfBookingAfterAddForContract, bookingList, true);

                for (Villa villa : villaSet) {
                    if (villa.getIdOfService().equals(idOfServiceBooking)) {
                        villaList.put(villa, (villaList.get(villa)) + 1);
                        ReadAndWriteFileOfVilla.writeToFileOfVilla(filePathOfVilla, villaList, false);
                        break;
                    }
                }
                for (House house : houseSet) {
                    if (house.getIdOfService().equals(idOfServiceBooking)) {
                        houseList.put(house, (houseList.get(house)) + 1);
                        ReadAndWriteFileOfHouse.writeToFileOfHouse(filePathOfHouse, houseList, false);
                        break;
                    }
                }
                for (Room room : roomSet) {
                    if (room.getIdOfService().equals(idOfServiceBooking)) {
                        roomList.put(room, (roomList.get(room)) + 1);
                        ReadAndWriteFileOfRoom.writeToFileOfRoom(filePathOfRoom, roomList, false);
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage());
            }
        }
    }

    @Override
    public void display() {
        Set<Booking> bookingList = ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBooking);
        for (Booking booking : bookingList) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public List<Booking> getList() {
        return new ArrayList<>(ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBooking));
    }
    public List<Booking> getListBookingAfterAddForContract () {
        return new ArrayList<>(ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBookingAfterAddForContract));
    }
}
