package services.impl;

import models.*;
import services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> listFacilityService = new LinkedHashMap<>();
    static {
        listFacilityService.put(new Villa("1", "Villa 1", 100, 300, 8, new RentalType("day"), "5 stars", 40, 3), 0);
        listFacilityService.put(new Villa("2", "Villa 2", 200, 400, 10, new RentalType("day"), "5 stars", 80, 3), 0);
        listFacilityService.put(new Villa("3", "Villa 3", 150, 350, 8, new RentalType("day"), "5 stars", 60, 3), 0);
        listFacilityService.put(new House("4", "House 1", 70, 200, 5, new RentalType("day"), "5 stars", 2), 0);
        listFacilityService.put(new House("5", "House 2", 75, 220, 5, new RentalType("day"), "5 stars", 2), 0);
        listFacilityService.put(new House("6", "House 3", 80, 240, 5, new RentalType("day"), "5 stars", 2), 0);
        listFacilityService.put(new Room("7", "Room 1", 40, 150, 3, new RentalType("day"), new FreeServiceIncluded("karaoke")), 0);
        listFacilityService.put(new Room("8", "Room 2", 45, 160, 3, new RentalType("day"), new FreeServiceIncluded("massage")), 0);
        listFacilityService.put(new Room("9", "Room 3", 50, 170, 3, new RentalType("day"), new FreeServiceIncluded("karaoke")), 0);
    }
    private static Map<Facility, Integer> listFacilityForMaintenance = new LinkedHashMap<>();
    private static int numberOfUseForVilla;
    private static int numberOfUseForHouse;
    private static int numberOfUseForRoom;
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addList() {
        System.out.println("What do you want?");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.print("Enter id of service: ");
                String idOfServiceForVilla = scanner.nextLine();
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
                listFacilityService.put(new Villa(idOfServiceForVilla, nameOfServiceForVilla, usableAreaForVilla, rentalCostForVilla, maxNumberPeopleForVilla, new RentalType(rentalTypeForVilla), rateRoomForVilla, poolAreaForVilla, numberFlorForVilla), numberOfUseForVilla);
                break;
            case 2:
                System.out.print("Enter id of service: ");
                String idOfServiceForHouse = scanner.nextLine();
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
                listFacilityService.put(new House(idOfServiceForHouse, nameOfServiceForHouse, usableAreaForHouse, rentalCostForHouse, maxNumberPeopleForHouse, new RentalType(rentalTypeForHouse), rateRoomForHouse, numberFlorForHouse), numberOfUseForHouse);
                break;
            case 3:
                System.out.print("Enter id of service: ");
                String idOfServiceForRoom = scanner.nextLine();
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
                listFacilityService.put(new Room(idOfServiceForRoom, nameOfServiceForRoom, usableAreaForRoom, rentalCostForRoom, maxNumberPeopleForRoom, new RentalType(rentalTypeForRoom), new FreeServiceIncluded(freeServiceIncludedForRoom)), numberOfUseForRoom);
                break;
            case 4:
                break;
            default:
                System.out.println("Error!!!");
        }

    }

    @Override
    public void displayList() {
        Set<Facility> mySet = listFacilityService.keySet();
        for (Facility facility : mySet) {
            System.out.println(facility + ", number of uses = " + listFacilityService.get(facility));
        }
    }

    @Override
    public void editList() {

    }
    public void displayListForMaintenance () {
        Set<Facility> mySet = listFacilityService.keySet();
        for (Facility facility : mySet) {
            if (listFacilityService.get(facility) > 5) {
                listFacilityForMaintenance.put(facility, listFacilityService.get(facility));
                listFacilityService.remove(facility);
            }
        }
        Set<Facility> mySetForMaintenance = listFacilityForMaintenance.keySet();
        for (Facility facilityForMaintenance : mySetForMaintenance) {
            System.out.println(facilityForMaintenance + ", number of uses = " + listFacilityForMaintenance.get(facilityForMaintenance));
        }
    }
}
