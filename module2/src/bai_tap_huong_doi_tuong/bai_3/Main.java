package bai_tap_huong_doi_tuong.bai_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int choose = -1;
        do {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Xóa sinh viên khỏi danh sách");
            System.out.println("4. Tìm kiếm sinh viên trong danh sách");
            System.out.println("5. Sắp xếp sinh viên theo mã số sinh viên");
            System.out.println("0. Exit");
            System.out.print("Hãy chọn chức năng: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentManager.add();
                    break;
                case 2:
                    studentManager.print();
                    break;
                case 3:
                    System.out.println("1. Xóa theo mã số sinh viên");
                    System.out.println("2. Xóa thứ số thứ tự trong danh sách sinh viên");
                    System.out.println("3. Quay lại menu chính");
                    System.out.print("Hãy chọn chức năng: ");
                    int chooseForRemove = Integer.parseInt(scanner.nextLine());
                    switch (chooseForRemove) {
                        case 1:
                            System.out.print("Hãy nhập mã số sinh viên của sinh viên cần xóa: ");
                            String idOfStudentForRemove = scanner.nextLine();
                            studentManager.remove(idOfStudentForRemove);
                            break;
                        case 2:
                            System.out.print("Hãy nhập số thứ tự của sinh viên cần xóa: ");
                            int numberForRemove = Integer.parseInt(scanner.nextLine());
                            studentManager.remove(numberForRemove);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Để tìm kiếm, hãy nhập mã số sinh viên hoặc họ tên của sinh viên");
                    String string = scanner.nextLine();
                    studentManager.search(string);
                    break;
                case 5:
                    studentManager.sort();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choose != 0);
    }
}
