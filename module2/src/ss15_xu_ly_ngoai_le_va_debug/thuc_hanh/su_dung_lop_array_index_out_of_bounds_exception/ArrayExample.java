package ss15_xu_ly_ngoai_le_va_debug.thuc_hanh.su_dung_lop_array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public int[] creatRandom () {
        Random random = new Random();
        int[] arrayRandom = new int[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arrayRandom[i] = random.nextInt(100);
            System.out.print(arrayRandom[i] + " ");
        }
        return arrayRandom;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array = arrayExample.creatRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int anyIndexAfterInput = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + anyIndexAfterInput + " là " + array[anyIndexAfterInput]);
        } catch (Exception e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
