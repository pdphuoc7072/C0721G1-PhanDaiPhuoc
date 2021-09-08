package services.impl;

import models.*;
import services.IFacilityService;
import utils.AllRegex;
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
    AllRegex allRegex = new AllRegex();

    @Override
    public void add() {
        while (true) {
            try {
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
                        boolean isValidOfIdServiceForVilla;
                        String idOfServiceForVilla;
                        do {
                            checkIdOfServiceForVilla = true;
                            do {
                                System.out.print("Enter id of service: ");
                                idOfServiceForVilla = scanner.nextLine();
                                isValidOfIdServiceForVilla = allRegex.validateOfIdService(idOfServiceForVilla);
                                if (!isValidOfIdServiceForVilla) {
                                    System.out.println("Error. The Id of service must be in the correct format: SVXX-YYYY");
                                }
                            } while (!isValidOfIdServiceForVilla);
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

                        String nameOfServiceForVilla;
                        boolean isValidOfNameServiceForVilla;
                        do {
                            System.out.print("Enter name of service: ");
                            nameOfServiceForVilla = scanner.nextLine();
                            isValidOfNameServiceForVilla = allRegex.validateOfNameService(nameOfServiceForVilla);
                            if (!isValidOfNameServiceForVilla) {
                                System.out.println("Error. The name of service must be in the correct format");
                            }
                        } while (!isValidOfNameServiceForVilla);

                        double usableAreaForVilla;
                        boolean isValidOfUsableAreaForVilla;
                        do {
                            System.out.print("Enter usable area (m2): ");
                            usableAreaForVilla = Double.parseDouble(scanner.nextLine());
                            isValidOfUsableAreaForVilla = allRegex.validateOfUsableArea(usableAreaForVilla);
                            if (!isValidOfUsableAreaForVilla) {
                                System.out.println("The usable area must be more than 30");
                            }
                        } while (!isValidOfUsableAreaForVilla);

                        double rentalCostForVilla;
                        boolean isValidOfRentalCostForVilla;
                        do {
                            System.out.print("Enter rental cost (USD): ");
                            rentalCostForVilla = Double.parseDouble(scanner.nextLine());
                            isValidOfRentalCostForVilla = allRegex.validateOfRentalCost(rentalCostForVilla);
                            if (!isValidOfRentalCostForVilla) {
                                System.out.println("The rental cost must be more than 0");
                            }
                        } while (!isValidOfRentalCostForVilla);

                        int maxNumberPeopleForVilla;
                        boolean isValidOfMaxNumberPeopleForVilla;
                        do {
                            System.out.print("Enter maximum people: ");
                            maxNumberPeopleForVilla = Integer.parseInt(scanner.nextLine());
                            isValidOfMaxNumberPeopleForVilla = allRegex.validateOfMaxNumberPeople(maxNumberPeopleForVilla);
                            if (!isValidOfMaxNumberPeopleForVilla) {
                                System.out.println("The max number people must be more than 0 and less than 20");
                            }
                        } while (!isValidOfMaxNumberPeopleForVilla);

                        String rentalTypeForVilla;
                        boolean isValidOfRentalTypeForVilla;
                        do {
                            System.out.print("Enter rental type (YEAR/MONTH/DAY/HOUR): ");
                            rentalTypeForVilla = scanner.nextLine();
                            isValidOfRentalTypeForVilla = allRegex.validateOfRentalType(rentalTypeForVilla);
                            if (!isValidOfRentalTypeForVilla) {
                                System.out.println("Error. The rental type must be in the correct format: RT-YEAR/MONTH/DAY/HOUR");
                            }
                        } while (!isValidOfRentalTypeForVilla);

                        String rateRoomForVilla;
                        boolean isValidOfRateRoomForVilla;
                        do {
                            System.out.print("Enter rate room: ");
                            rateRoomForVilla = scanner.nextLine();
                            isValidOfRateRoomForVilla = allRegex.validateOfRateRoom(rateRoomForVilla);
                            if (!isValidOfRateRoomForVilla) {
                                System.out.println("Error. The rate room must be in the correct format: X STARS");
                            }
                        } while (!isValidOfRateRoomForVilla);

                        double poolAreaForVilla;
                        boolean isValidOfPoolAreaForVilla;
                        do {
                            System.out.print("Enter pool area: ");
                            poolAreaForVilla = Double.parseDouble(scanner.nextLine());
                            isValidOfPoolAreaForVilla = allRegex.validateOfPoolArea(poolAreaForVilla);
                            if (!isValidOfPoolAreaForVilla) {
                                System.out.println("The pool area must be more than 30");
                            }
                        } while (!isValidOfPoolAreaForVilla);

                        int numberFlorForVilla;
                        boolean isValidOfNumberFlorForVilla;
                        do {
                            System.out.print("Enter number flor: ");
                            numberFlorForVilla = Integer.parseInt(scanner.nextLine());
                            isValidOfNumberFlorForVilla = allRegex.validateOfNumberFlor(numberFlorForVilla);
                            if (!isValidOfNumberFlorForVilla) {
                                System.out.println("The number flor must be more than 0");
                            }
                        } while (!isValidOfNumberFlorForVilla);

                        villaList.clear();
                        villaList.put(new Villa(idOfServiceForVilla, nameOfServiceForVilla, usableAreaForVilla, rentalCostForVilla, maxNumberPeopleForVilla, new RentalType(rentalTypeForVilla), rateRoomForVilla, poolAreaForVilla, numberFlorForVilla), 0);
                        ReadAndWriteFileOfVilla.writeToFileOfVilla(filePathOfVilla, villaList, true);
                        break;
                    case 2:
                        Map<House, Integer> houseList = getListHouse();
                        Set<House> houseSet = houseList.keySet();

                        boolean checkIdOfServiceForHouse;
                        boolean isValidOfIdServiceForHouse;
                        String idOfServiceForHouse;
                        do {
                            checkIdOfServiceForHouse = true;
                            do {
                                System.out.print("Enter id of service: ");
                                idOfServiceForHouse = scanner.nextLine();
                                isValidOfIdServiceForHouse = allRegex.validateOfIdService(idOfServiceForHouse);
                                if (!isValidOfIdServiceForHouse) {
                                    System.out.println("Error. The Id of service must be in the correct format: SVXX-YYYY");
                                }
                            }while (!isValidOfIdServiceForHouse);
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

                        String nameOfServiceForHouse;
                        boolean isValidOfNameServiceForHouse;
                        do {
                            System.out.print("Enter name of service: ");
                            nameOfServiceForHouse = scanner.nextLine();
                            isValidOfNameServiceForHouse = allRegex.validateOfNameService(nameOfServiceForHouse);
                            if (!isValidOfNameServiceForHouse) {
                                System.out.println("Error. The name of service must be in the correct format");
                            }
                        } while (!isValidOfNameServiceForHouse);

                        double usableAreaForHouse;
                        boolean isValidOfUsableAreaForHouse;
                        do {
                            System.out.print("Enter usable area (m2): ");
                            usableAreaForHouse = Double.parseDouble(scanner.nextLine());
                            isValidOfUsableAreaForHouse = allRegex.validateOfUsableArea(usableAreaForHouse);
                            if (!isValidOfUsableAreaForHouse) {
                                System.out.println("The usable area must be more than 30");
                            }
                        } while (!isValidOfUsableAreaForHouse);

                        double rentalCostForHouse;
                        boolean isValidOfRentalCostForHouse;
                        do {
                            System.out.print("Enter rental cost (USD): ");
                            rentalCostForHouse = Double.parseDouble(scanner.nextLine());
                            isValidOfRentalCostForHouse = allRegex.validateOfRentalCost(rentalCostForHouse);
                            if (!isValidOfRentalCostForHouse) {
                                System.out.println("The rental cost must be more than 0");
                            }
                        } while (!isValidOfRentalCostForHouse);

                        int maxNumberPeopleForHouse;
                        boolean isValidOfMaxNumberPeopleForHouse;
                        do {
                            System.out.print("Enter maximum people: ");
                            maxNumberPeopleForHouse = Integer.parseInt(scanner.nextLine());
                            isValidOfMaxNumberPeopleForHouse = allRegex.validateOfMaxNumberPeople(maxNumberPeopleForHouse);
                            if (!isValidOfMaxNumberPeopleForHouse) {
                                System.out.println("The max number people must be more than 0 and less than 20");
                            }
                        } while (!isValidOfMaxNumberPeopleForHouse);

                        String rentalTypeForHouse;
                        boolean isValidOfRentalTypeForHouse;
                        do {
                            System.out.print("Enter rental type (YEAR/MONTH/DAY/HOUR): ");
                            rentalTypeForHouse = scanner.nextLine();
                            isValidOfRentalTypeForHouse = allRegex.validateOfRentalType(rentalTypeForHouse);
                            if (!isValidOfRentalTypeForHouse) {
                                System.out.println("Error. The rental type must be in the correct format: RT-YEAR/MONTH/DAY/HOUR");
                            }
                        } while (!isValidOfRentalTypeForHouse);

                        String rateRoomForHouse;
                        boolean isValidOfRateRoomForHouse;
                        do {
                            System.out.print("Enter rate room: ");
                            rateRoomForHouse = scanner.nextLine();
                            isValidOfRateRoomForHouse = allRegex.validateOfRateRoom(rateRoomForHouse);
                            if (!isValidOfRateRoomForHouse) {
                                System.out.println("Error. The rate room must be in the correct format: X STARS");
                            }
                        } while (!isValidOfRateRoomForHouse);

                        int numberFlorForHouse;
                        boolean isValidOfNumberFlorForHouse;
                        do {
                            System.out.print("Enter number flor: ");
                            numberFlorForHouse = Integer.parseInt(scanner.nextLine());
                            isValidOfNumberFlorForHouse = allRegex.validateOfNumberFlor(numberFlorForHouse);
                            if (!isValidOfNumberFlorForHouse) {
                                System.out.println("The number flor must be more than 0");
                            }
                        } while (!isValidOfNumberFlorForHouse);

                        houseList.clear();
                        houseList.put(new House(idOfServiceForHouse, nameOfServiceForHouse, usableAreaForHouse, rentalCostForHouse, maxNumberPeopleForHouse, new RentalType(rentalTypeForHouse), rateRoomForHouse, numberFlorForHouse), 0);
                        ReadAndWriteFileOfHouse.writeToFileOfHouse(filePathOfHouse, houseList, true);
                        break;
                    case 3:
                        Map<Room, Integer> roomList = getListRoom();
                        Set<Room> roomSet = roomList.keySet();

                        boolean checkIdOfServiceForRoom;
                        boolean isValidOfIdServiceForRoom;
                        String idOfServiceForRoom;
                        do {
                            checkIdOfServiceForRoom = true;
                            do {
                                System.out.print("Enter id of service: ");
                                idOfServiceForRoom = scanner.nextLine();
                                isValidOfIdServiceForRoom = allRegex.validateOfIdService(idOfServiceForRoom);
                                if (!isValidOfIdServiceForRoom) {
                                    System.out.println("Error. The Id of service must be in the correct format: SVXX-YYYY");
                                }
                            }while (!isValidOfIdServiceForRoom);
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


                        String nameOfServiceForRoom;
                        boolean isValidOfNameServiceForRoom;
                        do {
                            System.out.print("Enter name of service: ");
                            nameOfServiceForRoom = scanner.nextLine();
                            isValidOfNameServiceForRoom = allRegex.validateOfNameService(nameOfServiceForRoom);
                            if (!isValidOfNameServiceForRoom) {
                                System.out.println("Error. The name of service must be in the correct format");
                            }
                        } while (!isValidOfNameServiceForRoom);

                        double usableAreaForRoom;
                        boolean isValidOfUsableAreaForRoom;
                        do {
                            System.out.print("Enter usable area (m2): ");
                            usableAreaForRoom = Double.parseDouble(scanner.nextLine());
                            isValidOfUsableAreaForRoom = allRegex.validateOfUsableArea(usableAreaForRoom);
                            if (!isValidOfUsableAreaForRoom) {
                                System.out.println("The usable area must be more than 30");
                            }
                        } while (!isValidOfUsableAreaForRoom);

                        double rentalCostForRoom;
                        boolean isValidOfRentalCostForRoom;
                        do {
                            System.out.print("Enter rental cost (USD): ");
                            rentalCostForRoom = Double.parseDouble(scanner.nextLine());
                            isValidOfRentalCostForRoom = allRegex.validateOfRentalCost(rentalCostForRoom);
                            if (!isValidOfRentalCostForRoom) {
                                System.out.println("The rental cost must be more than 0");
                            }
                        } while (!isValidOfRentalCostForRoom);

                        int maxNumberPeopleForRoom;
                        boolean isValidOfMaxNumberPeopleForRoom;
                        do {
                            System.out.print("Enter maximum people: ");
                            maxNumberPeopleForRoom = Integer.parseInt(scanner.nextLine());
                            isValidOfMaxNumberPeopleForRoom = allRegex.validateOfMaxNumberPeople(maxNumberPeopleForRoom);
                            if (!isValidOfMaxNumberPeopleForRoom) {
                                System.out.println("The max number people must be more than 0 and less than 20");
                            }
                        } while (!isValidOfMaxNumberPeopleForRoom);

                        String rentalTypeForRoom;
                        boolean isValidOfRentalTypeForRoom;
                        do {
                            System.out.print("Enter rental type (YEAR/MONTH/DAY/HOUR): ");
                            rentalTypeForRoom = scanner.nextLine();
                            isValidOfRentalTypeForRoom = allRegex.validateOfRentalType(rentalTypeForRoom);
                            if (!isValidOfRentalTypeForRoom) {
                                System.out.println("Error. The rental type must be in the correct format: RT-YEAR/MONTH/DAY/HOUR");
                            }
                        } while (!isValidOfRentalTypeForRoom);

                        System.out.print("Enter free inclusive service: ");
                        String freeInclusiveServiceForRoom = scanner.nextLine();

                        roomList.clear();
                        roomList.put(new Room(idOfServiceForRoom, nameOfServiceForRoom, usableAreaForRoom, rentalCostForRoom, maxNumberPeopleForRoom, new RentalType(rentalTypeForRoom), new FreeInclusiveService(freeInclusiveServiceForRoom)), 0);
                        ReadAndWriteFileOfRoom.writeToFileOfRoom(filePathOfRoom, roomList, true);
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Error!!!");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error. " + e.getMessage());
            }
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
                ReadAndWriteFileOfVilla.writeToFileOfVilla(filePathOfVilla, villaList, false);
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
                ReadAndWriteFileOfHouse.writeToFileOfHouse(filePathOfHouse, houseList, false);
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
                ReadAndWriteFileOfRoom.writeToFileOfRoom(filePathOfRoom, roomList, false);
            }
        }
        return ReadAndWriteFileOfRoom.readFromFileOfRoom(filePathOfRoomForMaintenance);
    }
}
