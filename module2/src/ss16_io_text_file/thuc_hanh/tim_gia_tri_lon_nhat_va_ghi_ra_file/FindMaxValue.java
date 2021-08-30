package ss16_io_text_file.thuc_hanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax (List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào đường dẫn của file đọc: ");
        String inPath = scanner.nextLine();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> myList = readAndWriteFile.readFile(inPath);
        int max = findMax(myList);
        System.out.print("Hãy nhập vào đường dẫn của file xuất: ");
        String outPath = scanner.nextLine();
        readAndWriteFile.writeFile(outPath, max);
    }
}
