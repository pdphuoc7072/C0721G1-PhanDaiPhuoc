package bai_jame_mo_rong_30_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> listStudent = new ArrayList<>();

    static {
        listStudent.add(new Student("Phước", 31, new Address("61", "Trần Văn Ơn", "Hòa An", "Cẩm Lệ", "Đà Nẵng")));
        listStudent.add(new Student("Kiệt", 28, new Address("13B", "Yên Thế", "Hòa An", "Cẩm Lệ", "Đà Nẵng")));
        listStudent.add(new Student("Trung", 35, new Address("45", "Trương Định", "Hòa An", "Cẩm Lệ", "Đà Nẵng")));
        listStudent.add(new Student("An", 20, new Address("60", "Hòa Bình", "Hòa An", "Cẩm Lệ", "Đà Nẵng")));
        listStudent.add(new Student("Phước", 25, new Address("300", "Trường Chinh", "Hòa An", "Cẩm Lệ", "Đà Nẵng")));
    }

    public static void addStudent () {
        System.out.print("Hãy nhập tên của sinh viên: ");
        String nameOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tuổi của sinh viên: ");
        int ageOfStudent = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập số nhà: ");
        String numHouseOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên đường: ");
        String streetOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên phường/xã: ");
        String wardOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên quận/huyện: ");
        String districtOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên tỉnh/thành phố: ");
        String provinceOfStudent = scanner.nextLine();
        listStudent.add(new Student(nameOfStudent, ageOfStudent, new Address(numHouseOfStudent, streetOfStudent, wardOfStudent, districtOfStudent, provinceOfStudent)));
    }
    public static void displayListStudent () {
        for (Student student : listStudent) {
            System.out.print(student + "\n");
        }
    }
    public static void sortNameOfStudent () {
        Collections.sort(listStudent);
        displayListStudent();
    }
}
