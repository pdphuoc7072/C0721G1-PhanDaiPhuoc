package ss17_io_binary_file_va_serialization.thuc_hanh.doc_va_ghi_danh_sach_sinh_vien_ra_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void writeToFile (String path, List<Student> listStudent) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(listStudent);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile (String path) {
        List<Student> listStudent = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            listStudent = (List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listStudent;
    }

    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập đường dẫn: ");
        String path = scanner.nextLine();
        listStudent.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        listStudent.add(new Student(2, "Nguyễn Minh Quân", "Quảng Nam"));
        listStudent.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        listStudent.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        listStudent.add(new Student(5, "Nguyễn Khắc Nhật", "Tp. HCM"));
        writeToFile(path, listStudent);
        List<Student> listStudentDataFromFile = readDataFromFile(path);
        for (Student student : listStudentDataFromFile) {
            System.out.println(student);
        }
    }
}
