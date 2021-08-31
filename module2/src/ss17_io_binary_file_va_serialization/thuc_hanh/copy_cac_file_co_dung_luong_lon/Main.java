package ss17_io_binary_file_va_serialization.thuc_hanh.copy_cac_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files (File source, File target) throws IOException {
        Files.copy(source.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream (File source, File target) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter target file: ");
        String targetPath = scanner.nextLine();
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        try {
//            copyFileUsingJava7Files(sourceFile, targetFile);
            copyFileUsingStream(sourceFile, targetFile);
            System.out.print("Copy completed");
        } catch (IOException e) {
            System.out.print("Can't copy that file");
            System.out.print(e.getMessage());
        }
    }
}
