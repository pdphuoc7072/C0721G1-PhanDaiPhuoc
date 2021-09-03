package services.impl;

import models.*;
import services.IFacilityService;
import utils.ReadAndWriteFileOfHouse;
import utils.ReadAndWriteFileOfRoom;
import utils.ReadAndWriteFileOfVilla;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
//    private static Map<Facility, Integer> listFacility = new LinkedHashMap<>();
    private static String filePathOfVilla = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\villa.csv";
    private static String filePathOfHouse = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\house.csv";
    private static String filePathOfRoom = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\room.csv";
//    static {
//        listFacility.put(new Villa("1", "Villa 1", 100, 300, 8, new RentalType("day"), "5 stars", 40, 3), 0);
//        listFacility.put(new Villa("2", "Villa 2", 200, 400, 10, new RentalType("day"), "5 stars", 80, 3), 0);
//        listFacility.put(new Villa("3", "Villa 3", 150, 350, 8, new RentalType("day"), "5 stars", 60, 3), 0);
//        listFacility.put(new House("4", "House 1", 70, 200, 5, new RentalType("day"), "5 stars", 2), 0);
//        listFacility.put(new House("5", "House 2", 75, 220, 5, new RentalType("day"), "5 stars", 2), 0);
//        listFacility.put(new House("6", "House 3", 80, 240, 5, new RentalType("day"), "5 stars", 2), 0);
//        listFacility.put(new Room("7", "Room 1", 40, 150, 3, new RentalType("day"), new FreeServiceIncluded("karaoke")), 0);
//        listFacility.put(new Room("8", "Room 2", 45, 160, 3, new RentalType("day"), new FreeServiceIncluded("massage")), 0);
//        listFacility.put(new Room("9", "Room 3", 50, 170, 3, new RentalType("day"), new FreeServiceIncluded("karaoke")), 0);
//    }
    private static Map<Facility, Integer> listFacilityForMaintenance = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("What do you want?");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Map<Villa, Integer> villaList = getListVilla();
                Set<Villa> villaSet = villaList.keySet();
                boolean checkIdOfServiceForVilla;
                String idOfServiceForVilla;
                do {
                    checkIdOfServiceForVilla = true;
                    System.out.print("Enter id of service: ");
                    idOfServiceForVilla = scanner.nextLine();
                    for (Villa villa : villaSet) {
                        if (idOfServiceForVilla.equals(villa.getIdOfService())) {
                            checkIdOfServiceForVilla = false;
                            break;
                        }
                    }
                    if (!checkIdOfServiceForVilla) {
                        System.out.println("This id of service already exists in the list");
                    }
                } while (!checkIdOfServiceForVilla);
                villaList.clear();
                System.out.print("Enter name of service: ");
                String nameOfServiceForVilla = scanner.nextLine();
                System.out.print("Enter usable area (m2): ");
                double usableAreaForVilla = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter rental cost (USD): ");
                double rentalCostForVilla = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter maximum people: ");
                int maxNumberPeopleForVilla = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter rental type (year/month/day/hour): ");
                String rentalTypeForVilla = scanner.nextLine();
                System.out.print("Enter rate room: ");
                String rateRoomForVilla = scanner.nextLine();
                System.out.print("Enter pool area: ");
                double poolAreaForVilla = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter number flor: ");
                int numberFlorForVilla = Integer.parseInt(scanner.nextLine());
                villaList.put(new Villa(idOfServiceForVilla, nameOfServiceForVilla, usableAreaForVilla, rentalCostForVilla, maxNumberPeopleForVilla, new RentalType(rentalTypeForVilla), rateRoomForVilla, poolAreaForVilla, numberFlorForVilla), 0);
                ReadAndWriteFileOfVilla.writeToFileOfVilla(filePathOfVilla, villaList, true);
                break;
            case 2:
                Map<House, Integer> houseList = getListHouse();
                Set<House> houseSet = houseList.keySet();
                boolean checkIdOfServiceForHouse;
                String idOfServiceForHouse;
                do {
                    checkIdOfServiceForHouse = true;
                    System.out.print("Enter id of service: ");
                    idOfServiceForHouse = scanner.nextLine();
                    for (House house : houseSet) {
                        if (idOfServiceForHouse.equals(house.getIdOfService())) {
                            checkIdOfServiceForHouse = false;
                            break;
                        }
                    }
                    if (!checkIdOfServiceForHouse) {
                        System.out.println("This id of service already exists in the list");
                    }
                } while (!checkIdOfServiceForHouse);
                houseList.clear();
                System.out.print("Enter name of service: ");
                String nameOfServiceForHouse = scanner.nextLine();
                System.out.print("Enter usable area (m2): ");
                double usableAreaForHouse = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter rental cost (USD): ");
                double rentalCostForHouse = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter maximum people: ");
                int maxNumberPeopleForHouse = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter rental type (year/month/day/hour): ");
                String rentalTypeForHouse = scanner.nextLine();
                System.out.print("Enter rate room: ");
                String rateRoomForHouse = scanner.nextLine();
                System.out.print("Enter number flor: ");
                int numberFlorForHouse = Integer.parseInt(scanner.nextLine());
                houseList.put(new House(idOfServiceForHouse, nameOfServiceForHouse, usableAreaForHouse, rentalCostForHouse, maxNumberPeopleForHouse, new RentalType(rentalTypeForHouse), rateRoomForHouse, numberFlorForHouse), 0);
                ReadAndWriteFileOfHouse.writeToFileOfHouse(filePathOfHouse, houseList, true);
                break;
            case 3:
                Map<Room, Integer> roomList = getListRoom();
                Set<Room> roomSet = roomList.keySet();
                boolean checkIdOfServiceForRoom;
                String idOfServiceForRoom;
                do {
                    checkIdOfServiceForRoom = true;
                    System.out.print("Enter id of service: ");
                    idOfServiceForRoom = scanner.nextLine();
                    for (Room room : roomSet) {
                        if (idOfServiceForRoom.equals(room.getIdOfService())) {
                            checkIdOfServiceForRoom = false;
                            break;
                        }
                    }
                    if (!checkIdOfServiceForRoom) {
                        System.out.println("This id of service already exists in the list");
                    }
                } while (!checkIdOfServiceForRoom);
                roomList.clear();
                System.out.print("Enter name of service: ");
                String nameOfServiceForRoom = scanner.nextLine();
                System.out.print("Enter usable area (m2): ");
                double usableAreaForRoom = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter rental cost (USD): ");
                double rentalCostForRoom = Double.parseDouble(scanner.nextLine());
                System.out.print("Enter maximum people: ");
                int maxNumberPeopleForRoom = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter rental type (year/month/day/hour): ");
                String rentalTypeForRoom = scanner.nextLine();
                System.out.print("Enter free service included: ");
                String freeServiceIncludedForRoom = scanner.nextLine();
                roomList.put(new Room(idOfServiceForRoom, nameOfServiceForRoom, usableAreaForRoom, rentalCostForRoom, maxNumberPeopleForRoom, new RentalType(rentalTypeForRoom), new FreeServiceIncluded(freeServiceIncludedForRoom)), 0);
                ReadAndWriteFileOfRoom.writeToFileOfRoom(filePathOfRoom, roomList, true);
                break;
            case 4:
                break;
            default:
                System.out.println("Error!!!");
        }
    }

    @Override
    public void display() {
        Map<Villa, Integer> villaList = getListVilla();
        Map<House, Integer> houseList = getListHouse();
        Map<Room, Integer> roomList = getListRoom();
        Set<Villa> villaSet = villaList.keySet();
        Set<House> houseSet = houseList.keySet();
        Set<Room> roomSet = roomList.keySet();
        for (Villa villa : villaSet) {
            System.out.println(villa.toString() + ", Number Of Use = " + villaList.get(villa));
        }
        for (House house : houseSet) {
            System.out.println(house.toString() + ", Number Of Use = " + houseList.get(house));
        }
        for (Room room : roomSet) {
            System.out.println(room.toString() + ", Number Of Use = " + roomList.get(room));
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public List<Facility> getList() {
        return null;
    }
    public Map<Villa, Integer> getListVilla() {
        return ReadAndWriteFileOfVilla.readFromFileOfVilla(filePathOfVilla);
    }
    public Map<House, Integer> getListHouse() {
        return ReadAndWriteFileOfHouse.readFromFileOfHouse(filePathOfHouse);
    }
    public Map<Room, Integer> getListRoom() {
        return ReadAndWriteFileOfRoom.readFromFileOfRoom(filePathOfRoom);
    }

    public void displayListForMaintenance () {
        Map<Villa, Integer> villaList = getListVilla();
        Map<House, Integer> houseList = getListHouse();
        Map<Room, Integer> roomList = getListRoom();
        Set<Villa> villaSet = villaList.keySet();
        Set<House> houseSet = houseList.keySet();
        Set<Room> roomSet = roomList.keySet();
        for (Villa villa : villaSet) {
            if (villaList.get(villa) > 5) {
                listFacilityForMaintenance.put(villa, villaList.get(villa));
                villaList.put(villa, 0);
            }
        }
        for (House house : houseSet) {
            if (houseList.get(house) > 5) {
                listFacilityForMaintenance.put(house, houseList.get(house));
                houseList.put(house, 0);
            }
        }
        for (Room room : roomSet) {
            if (roomList.get(room) > 5) {
                listFacilityForMaintenance.put(room, roomList.get(room));
                roomList.put(room, 0);
            }
        }
        Set<Facility> setListFacilityForMaintenance = listFacilityForMaintenance.keySet();
        for (Facility facilityForMaintenance : setListFacilityForMaintenance) {
            System.out.println(facilityForMaintenance + ", Number Of Use = " + listFacilityForMaintenance.get(facilityForMaintenance));
        }
    }
}
