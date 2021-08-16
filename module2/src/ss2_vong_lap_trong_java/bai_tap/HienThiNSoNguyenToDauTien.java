package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiNSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn hiển thị bao nhiêu số nguyên tố đầu tiên? ");
        int num = Integer.parseInt(scanner.nextLine());
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
