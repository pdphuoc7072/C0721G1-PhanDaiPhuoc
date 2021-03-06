package services.impl;

import models.*;
import services.IContactService;
import utils.*;

import java.util.*;

public class ContactServiceImpl implements IContactService {

    private static String filePathOfContract = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\contract.csv";
    private static String filePathOfBookingForContract = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\booking_for_contract.csv";
    private static String filePathOfRoom = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\room.csv";
    private static String filePathOfBookingAfterAddForContract = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\booking_after_add_for_contract.csv";
    static Scanner scanner = new Scanner(System.in);
    AllRegex allRegex = new AllRegex();

    @Override
    public void add() {
        while (true) {
            try {
                Queue<Booking> queueBooking = ReadAndWriteFileOfBookingForContract.readBookingForContractFromFile(filePathOfBookingForContract);
                Set<Contract> contractList = getListContract();
                if (queueBooking.isEmpty()) {
                    System.out.println("Done contract");
                } else {
                    for (int i = 0; i < queueBooking.size(); i++) {
                        System.out.println(queueBooking.peek());

                        String numberContract;
                        boolean check;
                        boolean isValidOfNumberContract;
                        do {
                            check = true;
                            do {
                                System.out.print("Enter number of contract: ");
                                numberContract = scanner.nextLine();
                                isValidOfNumberContract = allRegex.validateOfContract(numberContract);
                                if (!isValidOfNumberContract) {
                                    System.out.println("Error. The number contract must be in the correct format: CTXX-YYYY");
                                }
                            } while (!isValidOfNumberContract);
                            for (Contract contract : contractList) {
                                if (contract.getNumberOfContract().equals(numberContract)) {
                                    check = false;
                                    break;
                                }
                            }
                            if (!check) {
                                System.out.println("This is number of contract already exists in the list");
                            }
                        } while (!check);

                        String idOfBooking = queueBooking.peek().getIdOfBooking();

                        double preDeposit;
                        while (true) {
                            try {
                                System.out.print("Enter pre-deposit: ");
                                preDeposit = Double.parseDouble(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        double totalPayment;
                        while (true) {
                            try {
                                System.out.print("Enter total payment: ");
                                totalPayment = Double.parseDouble(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println(e.getMessage());
                            }
                        }


                        String idOfCustomer = queueBooking.peek().getIdOfCustomer();

                        contractList.clear();
                        contractList.add(new Contract(numberContract, idOfBooking, preDeposit, totalPayment, idOfCustomer));
                        ReadAndWriteFileOfContract.writeContractToFile(filePathOfContract, contractList, true);
                        queueBooking.poll();
                        ReadAndWriteFileOfBookingForContract.writeBookingForContractToFile(filePathOfBookingForContract, queueBooking, false);
                        break;
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
        Set<Contract> contractList = getListContract();
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    public void addListBookingForContract () {
        Queue<Booking> queueBooking = new LinkedList<>();
        Set<Booking> bookingList = ReadAndWriteFileOfBooking.readBookingFromFile(filePathOfBookingAfterAddForContract);
        List<Booking> bookings = new ArrayList<>();
        bookings.addAll(bookingList);
        Map<Room, Integer> roomList = ReadAndWriteFileOfRoom.readFromFileOfRoom(filePathOfRoom);
        Set<Room> roomSet = roomList.keySet();
        for (int i = 0; i < bookings.size(); i++){
            for (Room room : roomSet) {
                if (bookings.get(i).getIdOfService().equals(room.getIdOfService())) {
                    bookings.remove(i);
                    break;
                }
            }
        }
        for (Booking booking : bookings) {
            queueBooking.add(booking);
        }
        bookingList.clear();
        ReadAndWriteFileOfBooking.writeBookingToFile(filePathOfBookingAfterAddForContract, bookingList, false);
        ReadAndWriteFileOfBookingForContract.writeBookingForContractToFile(filePathOfBookingForContract, queueBooking, true);
        displayListBookingForContract();
    }

    public void displayListBookingForContract () {
        Queue<Booking> bookingForContract = ReadAndWriteFileOfBookingForContract.readBookingForContractFromFile(filePathOfBookingForContract);
        for (Booking booking : bookingForContract) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void edit() {
        Set<Contract> contractList = getListContract();
        display();

        String numberOfContractForEdit;
        boolean isValidOfNumberContractForEdit;
        boolean check;
        do {
            check = false;
            do {
                System.out.print("Please enter number of contract for edit: ");
                numberOfContractForEdit = scanner.nextLine();
                isValidOfNumberContractForEdit = allRegex.validateOfContract(numberOfContractForEdit);
                if (!isValidOfNumberContractForEdit) {
                    System.out.println("Error. The number contract must be in the correct format: CTXX-YYYY");
                }
            } while (!isValidOfNumberContractForEdit);
            for (Contract contract : contractList) {
                if (contract.getNumberOfContract().equals(numberOfContractForEdit)) {
                    check = true;
                    try {
                        System.out.println("What do you want to edit?");
                        System.out.println("1. Edit number of contract");
                        System.out.println("2. Edit pre-deposit");
                        System.out.println("3. Edit total payment");
                        System.out.print("Please enter number: ");
                        int choose = Integer.parseInt(scanner.nextLine());
                        switch (choose) {
                            case 1:
                                String newNumberOfContract;
                                boolean isValidOfNewNumberContract;
                                do {
                                    System.out.print("Please enter new number of contract: ");
                                    newNumberOfContract = scanner.nextLine();
                                    isValidOfNewNumberContract = allRegex.validateOfContract(newNumberOfContract);
                                    if (!isValidOfNewNumberContract) {
                                        System.out.println("Error. The number contract must be in the correct format: CTXX-YYYY");
                                    }
                                } while (!isValidOfNewNumberContract);
                                contract.setNumberOfContract(newNumberOfContract);
                                ReadAndWriteFileOfContract.writeContractToFile(filePathOfContract, contractList, false);
                                break;
                            case 2:
                                double newPreDeposit;
                                while (true) {
                                    try {
                                        System.out.print("Please enter new pre deposit: ");
                                        newPreDeposit = Double.parseDouble(scanner.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                contract.setPreDeposit(newPreDeposit);
                                ReadAndWriteFileOfContract.writeContractToFile(filePathOfContract, contractList, false);
                                break;
                            case 3:
                                double newTotalPayment;
                                while (true) {
                                    try {
                                        System.out.print("Please enter new total payment: ");
                                        newTotalPayment = Double.parseDouble(scanner.nextLine());
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                contract.setTotalPayment(newTotalPayment);
                                ReadAndWriteFileOfContract.writeContractToFile(filePathOfContract, contractList, false);
                                break;
                            default:
                                System.out.println("Error. Please re-enter.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
            }
            if (!check) {
                System.out.println("This is number of contract already exists in the list");
            }
        }while (!check);
    }

    @Override
    public List<Contract> getList() {
        return null;
    }
    public Set<Contract> getListContract () {
        return ReadAndWriteFileOfContract.readContractFromFile(filePathOfContract);
    }

}
