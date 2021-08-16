package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập size của mảng: ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Hãy nhập phần tử có index là " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Mảng vừa tạo là: " + Arrays.toString(array));
        System.out.println("\nHãy nhập phần tử cần chèn: ");
        int X = Integer.parseInt(scanner.nextLine());
        System.out.println("Bạn muốn chèn phần tử X vào index bao nhiêu?");
        int indexOfX = Integer.parseInt(scanner.nextLine());
        if (indexOfX <= -1 || indexOfX > array.length - 1) {
            System.out.println("Xin lỗi không chèn được X vào mảng");
        } else {
            for (int i = array.length -1; i > indexOfX; i--) {
                array[i] = array[i-1];
            }
            array[indexOfX] = X;
            System.out.print("Mảng sau khi chèn phần tử " + X + " là: " + Arrays.toString(array));
        }
    }
}
