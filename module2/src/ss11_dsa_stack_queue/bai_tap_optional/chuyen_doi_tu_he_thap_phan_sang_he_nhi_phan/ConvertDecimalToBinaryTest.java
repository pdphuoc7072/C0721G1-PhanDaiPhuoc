package ss11_dsa_stack_queue.bai_tap_optional.chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;

import java.util.Scanner;

public class ConvertDecimalToBinaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConvertDecimalToBinary convert = new ConvertDecimalToBinary();
        System.out.print("Hãy nhập vào 1 số nguyên không âm bất kỳ: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Hệ nhị phân của " + number + " là: ");
        convert.convertDecimalToBinary(number);
    }
}
