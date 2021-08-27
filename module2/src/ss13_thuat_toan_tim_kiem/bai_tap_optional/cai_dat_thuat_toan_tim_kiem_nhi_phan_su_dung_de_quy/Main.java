package ss13_thuat_toan_tim_kiem.bai_tap_optional.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int binarySearch (int[] array, int left, int right, int value) {
        if (left < 0 || right > array.length) {
            return -1;
        }
        if (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            } else {
                binarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập kích thước của mảng: ");
        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] arrayOfInteger = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Hãy nhập phần tử ở vị trí index: " + i);
            arrayOfInteger[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng sau khi tạo: " + Arrays.toString(arrayOfInteger) + "\n");
        for (int i = 0; i < arrayOfInteger.length - 1; i++) {
            for (int j = 0; j < arrayOfInteger.length - i - 1; j++) {
                if (arrayOfInteger[j] > arrayOfInteger[j+1]) {
                    int temp = arrayOfInteger[j];
                    arrayOfInteger[j] = arrayOfInteger[j+1];
                    arrayOfInteger[j+1] = temp;
                }
            }
        }
        System.out.print("Mảng sau khi sắp xếp: " + Arrays.toString(arrayOfInteger) + "\n");
        System.out.print("Hãy nhập số cần tìm: ");
        int numberToSearch = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(arrayOfInteger, 0, arrayOfInteger.length - 1, numberToSearch);
        if (result == -1) {
            System.out.print("Không tìm thấy " + numberToSearch + " ở trong mảng.");
        } else {
            System.out.print("Số " + numberToSearch + " ở vị trí index : " + result);
        }
    }
}
