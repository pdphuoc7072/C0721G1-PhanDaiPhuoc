package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập kích thước của mảng: ");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] arrayOfInteger = new int[sizeOfArray];
        System.out.println("Hãy nhập " + sizeOfArray + " phần tử: ");
        for (int i = 0; i < sizeOfArray; i++) {
            arrayOfInteger[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng mà bạn đã nhập là: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println(arrayOfInteger[i] + "\t");
        }
        insertionSortByStep(arrayOfInteger);

    }
    public static void insertionSortByStep (int[] array) {
        int insertionIndex;
        int tempValue;
        for (int i = 1; i < array.length; i++) {
            System.out.println("Lần " + i + ": ");
            System.out.println("Lấy giá trị " + array[i] + " ở vị trí " + i + " bỏ ra ngoài");
            tempValue = array[i];
            insertionIndex = i;
            while (insertionIndex > 0 && tempValue < array[insertionIndex - 1]) {
                System.out.println("So sánh giá trị của " + tempValue + " và " + array[insertionIndex - 1] + ", nếu " + tempValue + " nhỏ hơn " + array[insertionIndex - 1] + " thì: ");
                System.out.println("\t=> Gán giá trị của " + array[insertionIndex - 1] + " vào vị trị " + insertionIndex);
                array[insertionIndex] = array[insertionIndex - 1];
                insertionIndex--;
            }
            System.out.println("Gán " + tempValue + " vào vị trí " + insertionIndex);
            array[insertionIndex] = tempValue;
            System.out.print("Mảng sau khi chèn lần '" + i + "': ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }
}
