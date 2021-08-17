package ss2_vong_lap_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MangNangCao {
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
        int max1 = array[0];
        int max2 = array[1];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if(array[i] > max2 && array[i] != max1) {
                max2 = array[i];
            } else if (max1 == max2) {
                max2=array[i];
            }
        }
        System.out.println("\nMảng có giá trị lớn thứ 2 là: " + max2);
    }
}
