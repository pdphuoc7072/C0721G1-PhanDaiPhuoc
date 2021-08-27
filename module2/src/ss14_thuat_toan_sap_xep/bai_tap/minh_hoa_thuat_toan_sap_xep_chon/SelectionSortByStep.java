package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chon;

import java.util.Scanner;

public class SelectionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập kích thước của mảng: ");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] arrayOfInteger = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print("Hãy nhập phần tử có index = " + i + " : ");
            arrayOfInteger[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng sau khi tạo là: ");
        for (int i : arrayOfInteger) {
            System.out.print(i + "\t");
        }
        selectionSortByStep(arrayOfInteger);
    }
    public static void selectionSortByStep (int[] array) {
        int currentMin;
        int currentMinOfIndex;
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nLần thứ " + (i + 1) + ": ");
            System.out.println("Gán " + array[i] + " thành currenMin và curentMinOfIndex là " + i);
            currentMin = array[i];
            currentMinOfIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < currentMin) {
                    System.out.println("Nếu giá trị của " + array[j] + " nhỏ hơn " + currentMin + ": ");
                    System.out.println("=> Gán " + array[j] + " thành currentMin " + " và gán " + j + " thành curentMinOfIndex");
                    currentMin = array[j];
                    currentMinOfIndex = j;
                }
            }
            if (currentMinOfIndex != i) {
                System.out.println("Nếu " + currentMinOfIndex + " khác với " + i + " thì: ");
                System.out.println("Gán " + array[i] + " vào vị trí " + currentMinOfIndex + " và gán " + currentMin + " vào vị trí " + i);
                array[currentMinOfIndex] = array[i];
                array[i] = currentMin;
            }
            System.out.println("Mảng sau khi sắp xếp lần " + (i+1) + " là: ");
            for (int k : array) {
                System.out.print(k + "\t");
            }
            System.out.println("\n--------------------------------");
        }
        System.out.print("Mảng sau khi sắp xếp chọn theo thứ tự tăng dần là: ");
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
