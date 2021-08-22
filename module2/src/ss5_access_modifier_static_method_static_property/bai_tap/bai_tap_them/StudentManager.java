package ss5_access_modifier_static_method_static_property.bai_tap.bai_tap_them;

import java.util.Scanner;

public class StudentManager {
    static Student studentList[] = new Student[100];
    static Scanner scanner = new Scanner(System.in);

    static {
        studentList[0] = new Student("Phước", 31, "Đà Nẵng");
        studentList[1] = new Student("Sang", 28, "Đà Nẵng");
        studentList[2] = new Student("Tân", 30, "Quảng Ngãi");
        studentList[3] = new Student("Thiện", 21, "Hà Nội");
        studentList[4] = new Student("An", 25, "Quảng Nam");
    }

    public static void addStudent () {
        System.out.print("Hãy nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Hãy nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập địa chỉ: ");
        String address = scanner.nextLine();
        for (int i = 0; i < 100; i++) {
            if (studentList[i] == null) {
                studentList[i] = new Student(name, age, address);
                break;
            } else {
                continue;
            }
        }
    }
    public static void deleteStudent () {
        System.out.print("Hãy nhập tên của sinh viên mà bạn muốn xóa: ");
        String nameStudentToDelete = scanner.nextLine();
        for (int i = 0; i < 100; i++) {
            if (studentList[i].getNameStudent().equals(nameStudentToDelete)) {
                for (int j = i; j < 99; j++) {
                    studentList[j] = studentList[j+1];
                }
                break;
            }
        }
    }
    public static void editListStudent () {
        System.out.print("Hãy nhập tên của sinh viên mà bạn muốn sửa: ");
        String nameStudentToEdit = scanner.nextLine();
        for (int i = 0; i < 100; i++) {
            if (studentList[i].getNameStudent().equals(nameStudentToEdit)) {
                System.out.print("1. Sửa tên của sinh viên\n");
                System.out.print("2. Sửa tuổi của sinh viên\n");
                System.out.print("3. Sửa địa chỉ của sinh viên\n");
                System.out.print("Bạn muốn sửa gì? Hãy nhập số 1, 2 hoặc 3: ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Hãy nhập tên mới: ");
                        String newNameStudent = scanner.nextLine();
                        studentList[i].setNameStudent(newNameStudent);
                        break;
                    case 2:
                        System.out.print("Hãy nhập tuổi mới: ");
                        int newAgeStudent = Integer.parseInt(scanner.nextLine());
                        studentList[i].setAgeStudent(newAgeStudent);
                        break;
                    case 3:
                        System.out.print("Hãy nhập địa chỉ mới: ");
                        String newAddressStudent = scanner.nextLine();
                        studentList[i].setAddressStudent(newAddressStudent);
                        break;
                    default:
                        System.out.print("Lỗi. Hãy nhập lại");
                }
                break;
            }
        }
    }
    public static void searchListStudent () {
        System.out.print("Hãy nhập tên của sinh viên cần tìm: ");
        String searchNameStudent = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].getNameStudent().equals(searchNameStudent)) {
                System.out.println("Sinh viên cần tìm là: ");
                System.out.println(studentList[i].displayStudent());
                break;
            }
        }
    }
    public static void displayListStudent () {
        for (int i = 0; i < 100; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i].displayStudent());
            }
        }
    }
}
