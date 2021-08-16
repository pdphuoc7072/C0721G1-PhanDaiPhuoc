package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập size của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hãy nhập phần tử có index là " + i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa tạo là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nHãy nhập phần tử cần xóa: ");
        int X = scanner.nextInt();
        boolean check = true;
        int x = 0;
        for (int j = 0; j < array.length; j++) {
            if (X == array[j]) {
                x = j;
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (check == false) {
            System.out.println("Phần tử cần xóa không có trong mảng này!!!");
        } else {
            for (int i = x; i < array.length - 1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            System.out.print("Mảng mới sau khi xóa là: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
