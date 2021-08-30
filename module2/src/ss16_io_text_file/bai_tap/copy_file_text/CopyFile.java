package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào đường dẫn của tập tin nguồn (source file): ");
        String inPath = scanner.nextLine();
        System.out.print("Hãy nhập vào đường dẫn của tập tin đích (target file): ");
        String outPath = scanner.nextLine();
        try {
            File file = new File(inPath);
            InputStream inputStream = new FileInputStream(file);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            OutputStream outputStream = new FileOutputStream(outPath);
            int k;
            int count = 0;
            while ((k = inputStream.read()) != -1) {
                outputStream.write(k);
                count++;
            }
            System.out.println("Hoàn thành. Số ký tự đã copy là: " + count);
            outputStream.close();
        } catch (Exception e) {
            System.err.println("Tệp nguồn không tồn tại hoặc tập tin đích đã tồn tại. ");
        }
    }


}
