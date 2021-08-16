package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập size của mảng 1: ");
        int size1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Trong mảng 1, hãy nhập phần tử có index là: " + i);
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Hãy nhập size của mảng 2: ");
        int size2 = Integer.parseInt(scanner.nextLine());
        int[] array2 = new int[size2];
        for (int j = 0; j < array2.length; j++) {
            System.out.println("Trong mảng 2, hãy nhập phần tử có index là: " + j);
            array2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng 1 vừa tạo là: " + Arrays.toString(array1));
        System.out.print("\nMảng 2 vừa tạo là: " + Arrays.toString(array2));
        int[] array3 = new int[size1 + size2];
        for (int k = 0; k < array1.length; k++) {
            array3[k] = array1[k];
        }
        for (int l = 0; l < array2.length; l++) {
            array3[array1.length + l] = array2[l];
        }
        System.out.print("\nMảng 3 (gộp 2 mảng 1 và 2) sẽ là: " + Arrays.toString(array3));
    }
}
