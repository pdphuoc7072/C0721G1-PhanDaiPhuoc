package ss17_io_binary_file_va_serialization.bai_tap_optional.copy_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        listStudent.add(new Student(2, "Nguyễn Minh Quân", "Quảng Nam"));
        listStudent.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        listStudent.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        listStudent.add(new Student(5, "Nguyễn Khắc Nhật", "Tp. HCM"));
        System.out.print("Hãy nhập đường dẫn của file nhị phân: ");
        String path = scanner.nextLine();
        System.out.print("Hãy nhập đường dẫn của file nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Hãy nhập đường dẫn của file đích: ");
        String targetPath = scanner.nextLine();
        WriteToFileBinary.writeToFileBinary(path, listStudent);
        CopyFileBinary.copyFileBinary(sourcePath, targetPath);
    }


}
