package ss14_thuat_toan_sap_xep.thuc_hanh.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] listOfInteger = new int[sizeOfArray];
        System.out.println("Enter " + listOfInteger.length + " values: ");
        for (int i = 0; i < sizeOfArray; i++) {
            listOfInteger[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(listOfInteger[i] + "\n");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(listOfInteger);
    }
    public static void bubbleSortByStep (int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j+1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
