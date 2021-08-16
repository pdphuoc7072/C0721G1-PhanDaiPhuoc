package _3_Mang_Va_Phuong_Thuc_Trong_Java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập size của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hãy nhập phần tử có index là: " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        int x = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                x = i;
            }
        }
        System.out.print("\nGiá trị nhỏ nhất của mảng là: " + min + ", ở vị trí index = " + x);
    }
}
