package ss13_thuat_toan_tim_kiem.thuc_hanh.cai_dat_thuat_toan_tim_kiem_nhi_phan_khong_su_dung_de_quy;

import javax.swing.plaf.synth.SynthUI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch (int [] arrayOfInteger, int value) {
        int left = 0;
        int right = arrayOfInteger.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (value < arrayOfInteger[middle]) {
                right = middle - 1;
            } else if (value == arrayOfInteger[middle]) {
                return middle;
            } else {
                left = middle + 1;
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

        int result = binarySearch(arrayOfInteger, numberToSearch);
        if (result == -1) {
            System.out.print("Không tìm thấy " + numberToSearch + " ở trong mảng.");
        } else {
            System.out.print("Số " + numberToSearch + " ở vị trí index : " + result);
        }
    }
}
