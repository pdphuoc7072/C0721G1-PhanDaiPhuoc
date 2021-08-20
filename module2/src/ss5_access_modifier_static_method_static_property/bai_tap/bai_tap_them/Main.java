package ss5_access_modifier_static_method_static_property.bai_tap.bai_tap_them;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Menu: \n");
            System.out.print("\t1. Thêm sinh viên\n");
            System.out.print("\t2. Xóa sinh viên\n");
            System.out.print("\t3. Sửa sinh viên\n");
            System.out.print("\t4. Tìm kiếm sinh viên\n");
            System.out.print("\t5. Hiển thị sinh viên\n");
            System.out.print("\t0. Exit\n");
            System.out.print("Hãy chọn từ menu: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    StudentManager.addStudent();
                    break;
                case 2:
                    StudentManager.deleteStudent();
                    break;
                case 3:
                    StudentManager.editListStudent();
                    break;
                case 4:
                    StudentManager.searchListStudent ();
                    break;
                case 5:
                    StudentManager.displayListStudent ();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.print("Lỗi. Hãy nhập lại.\n");
            }
        } while (choice != 0);
    }
}
