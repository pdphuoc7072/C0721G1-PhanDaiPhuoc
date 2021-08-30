package bai_lam_them_23_8;


import java.util.Scanner;

public class StudentManager {
    static Student[] listStudent = new Student[100];
    static Scanner scanner = new Scanner(System.in);

    static {
        listStudent[0] = new Student("A", 23, null);
        listStudent[1] = new Student("B", 20, null);
        listStudent[2] = new Student("C", 26, null);
    }

    public static void addStudent () {
        System.out.print("Hãy nhập tên: ");
        String nameOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tuổi: ");
        int ageOfStudent = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập số nhà: ");
        int numHouseOfStudent = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên đường: ");
        String streetOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên phường/xã: ");
        String wardOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên quận/huyện: ");
        String districtOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập tên tỉnh/thành phố: ");
        String provinceOfStudent = scanner.nextLine();
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] == null) {
                Address addressOfStudent = new Address(numHouseOfStudent, streetOfStudent, wardOfStudent, districtOfStudent, provinceOfStudent);
                listStudent[i] = new Student(nameOfStudent, ageOfStudent, addressOfStudent);
                break;
            } else {
                continue;
            }
        }
    }
    public static void displayListStudent () {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] != null) {
                System.out.println(listStudent[i].toString());
            }
        }

    }
}
