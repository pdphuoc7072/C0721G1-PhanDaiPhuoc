package _3_Mang_Va_Phuong_Thuc_Trong_Java.bai_tap;

import java.util.Scanner;

public class Dem_So_Lan_Xuat_Hien_Cua_Ky_Tu_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 chuỗi ký tự: ");
        String str = scanner.nextLine();
//        System.out.println("Hãy nhập vào 1 ký tự bất kỳ: ");
        char s = 's';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                count ++;
            }
        }
        if (count == 0) {
            System.out.println("Không tìm thấy ký tự " + s + " ở trong chuỗi ban đầu");
        } else {
            System.out.println("Có " + count + " ký tự " + s + " ở trong chuỗi ban đầu");
        }
    }
}
