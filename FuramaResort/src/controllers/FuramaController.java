package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("\tMenu: \n");
            System.out.print("\t1. Employee Management \n");
            System.out.print("\t2. Customer Management \n");
            System.out.print("\t3. Facility Management \n");
            System.out.print("\t4. Booking Management \n");
            System.out.print("\t5. Promotion Management \n");
            System.out.print("\t6. Exit \n");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choiceNumber1 = -1;
                    do {
                        System.out.print("\t1. Display list employees \n");
                        System.out.print("\t2. Add new employee \n");
                        System.out.print("\t3. Edit employee \n");
                        System.out.print("\t4. Return main menu \n");
                        System.out.print("Enter your choice: ");
                        choiceNumber1 = Integer.parseInt(scanner.nextLine());
                        switch (choiceNumber1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Error. Please re-enter your choice.");
                        }
                    } while (choiceNumber1 != 4);
                    break;
                case 2:
                    int choiceNumber2 = -1;
                    do {
                        System.out.print("\t1. Display list customers \n");
                        System.out.print("\t2. Add new customer \n");
                        System.out.print("\t3. Edit customer \n");
                        System.out.print("\t4. Return main menu \n");
                        System.out.print("Enter your choice: ");
                        choiceNumber2 = Integer.parseInt(scanner.nextLine());
                        switch (choiceNumber2) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Error. Please re-enter your choice.");
                        }
                    } while (choiceNumber2 != 4);
                    break;
                case 3:
                    int choiceNumber3 = -1;
                    do {
                        System.out.print("\t1. Display list facility \n");
                        System.out.print("\t2. Add new facility \n");
                        System.out.print("\t3. Display list facility maintenance \n");
                        System.out.print("\t4. Return main menu \n");
                        System.out.print("Enter your choice: ");
                        choiceNumber3 = Integer.parseInt(scanner.nextLine());
                        switch (choiceNumber3) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Error. Please re-enter your choice.");
                        }
                    } while (choiceNumber3 != 4);
                    break;
                case 4:
                    int choiceNumber4 = -1;
                    do {
                        System.out.print("\t1. Add new booking \n");
                        System.out.print("\t2. Display list booking \n");
                        System.out.print("\t3. Create new contracts \n");
                        System.out.print("\t4. Display list contracts \n");
                        System.out.print("\t5. Edit contracts \n");
                        System.out.print("\t6. Return main menu \n");
                        System.out.print("Enter your choice: ");
                        choiceNumber4 = Integer.parseInt(scanner.nextLine());
                        switch (choiceNumber4) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Error. Please re-enter your choice.");
                        }
                    } while (choiceNumber4 != 6);
                    break;
                case 5:
                    int choiceNumber5 = -1;
                    do {
                        System.out.print("\t1. Display list customers use service \n");
                        System.out.print("\t2. Display list customers get voucher \n");
                        System.out.print("\t3. Return main menu \n");
                        System.out.print("Enter your choice: ");
                        choiceNumber5 = Integer.parseInt(scanner.nextLine());
                        switch (choiceNumber5) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Error. Please re-enter your choice.");
                        }
                    } while (choiceNumber5 != 3);
                    break;
                case 6:
                    System.exit(6);
            }
        } while (choice != 6);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
