package _2_Vong_Lap_Trong_Java.bai_tap;

import java.util.Scanner;

public class Hien_Thi_N_So_Nguyen_To_Dau_Tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn hiển thị bao nhiêu số nguyên tố đầu tiên? ");
        int num = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < num) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(N)) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
