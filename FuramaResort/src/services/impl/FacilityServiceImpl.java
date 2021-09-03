package services.impl;

import models.*;
import services.IFacilityService;
import utils.ReadAndWriteFileOfHouse;
import utils.ReadAndWriteFileOfRoom;
import utils.ReadAndWriteFileOfVilla;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    private static String filePathOfVilla = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\villa.csv";
    private static String filePathOfHouse = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\house.csv";
    private static String filePathOfRoom = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\room.csv";
    private static String filePathOfVillaForMaintenance = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\villa_for_maintenance.csv";
    private static String filePathOfHouseForMaintenance = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\house_for_maintenance.csv";
    private static String filePathOfRoomForMaintenance = "D:\\C0721G1_Phan_Dai_Phuoc\\FuramaResort\\src\\data\\room_for_maintenance.csv";
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
        Map<Villa, Integer> villaListForMaintenance = getListVillaForMaintenance();
        Map<House, Integer> houseListForMaintenance = getListHouseForMaintenance();
        Map<Room, Integer> roomListForMaintenance = getListRoomForMaintenance();
        Set<Villa> villaSetForMaintenance = villaListForMaintenance.keySet();
        Set<House> houseSetForMaintenance = houseListForMaintenance.keySet();
        Set<Room> roomSetForMaintenance = roomListForMaintenance.keySet();
        for (Villa villa : villaSetForMaintenance) {
            System.out.println(villa.toString() + ", Number Of Use = " + villaListForMaintenance.get(villa));
        }
        for (House house : houseSetForMaintenance) {
            System.out.println(house.toString() + ", Number Of Use = " + houseListForMaintenance.get(house));
        }
        for (Room room : roomSetForMaintenance) {
            System.out.println(room.toString() + ", Number Of Use = " + roomListForMaintenance.get(room));
        }
    }
    public Map<Villa, Integer> getListVillaForMaintenance () {
        Map<Villa, Integer> villaList = getListVilla();
        Set<Villa> villaSet = villaList.keySet();
        Map<Villa, Integer> villaListForMaintenance = new LinkedHashMap<>();
        for (Villa villa : villaSet) {
            if (villaList.get(villa) > 5) {
                villaListForMaintenance.put(villa, villaList.get(villa));
                ReadAndWriteFileOfVilla.writeToFileOfVilla(filePathOfVillaForMaintenance, villaListForMaintenance, true);
                villaList.put(villa, 0);
            }
        }
        return ReadAndWriteFileOfVilla.readFromFileOfVilla(filePathOfVillaForMaintenance);
    }
    public Map<House, Integer> getListHouseForMaintenance () {
        Map<House, Integer> houseList = getListHouse();
        Set<House> houseSet = houseList.keySet();
        Map<House, Integer> houseListForMaintenance = new LinkedHashMap<>();
        for (House house : houseSet) {
            if (houseList.get(house) > 5) {
                houseListForMaintenance.put(house, houseList.get(house));
                ReadAndWriteFileOfHouse.writeToFileOfHouse(filePathOfHouseForMaintenance, houseListForMaintenance, true);
                houseList.put(house, 0);
            }
        }
        return ReadAndWriteFileOfHouse.readFromFileOfHouse(filePathOfHouseForMaintenance);
    }
    public Map<Room, Integer> getListRoomForMaintenance () {
        Map<Room, Integer> roomList = getListRoom();
        Set<Room> roomSet = roomList.keySet();
        Map<Room, Integer> roomListForMaintenance = new LinkedHashMap<>();
        for (Room room : roomSet) {
            if (roomList.get(room) > 5) {
                roomListForMaintenance.put(room, roomList.get(room));
                ReadAndWriteFileOfRoom.writeToFileOfRoom(filePathOfRoomForMaintenance, roomListForMaintenance, true);
                roomList.put(room, 0);
            }
        }
        return ReadAndWriteFileOfRoom.readFromFileOfRoom(filePathOfRoomForMaintenance);
    }
}
