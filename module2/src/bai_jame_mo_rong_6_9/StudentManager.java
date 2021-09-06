package bai_jame_mo_rong_6_9;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentManager {
    private static Map<Student, Integer> studentList = new TreeMap<>();
    static {
        studentList.put(new Student("Phước", 31, "C0721G1"), 0);
        studentList.put(new Student("Sang", 25, "C0721G1"), 0);
        studentList.put(new Student("Tân", 31, "C0721G1"), 0);
        studentList.put(new Student("Thiện", 21, "C0721G1"), 0);
        studentList.put(new Student("Nhật", 22, "C0721G1"), 0);
    }
    public static void add () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Hãy nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        Set<Student> studentSet = studentList.keySet();
        boolean check = false;
        for (Student student : studentSet) {
            if (name.equals(student.getName())) {
                check = true;
                studentList.put(student, (studentList.get(student) + 1));
            }
        }
        if (!check) {
            studentList.put(new Student(name, age, nameClass), 0);
        }
    }
    public static void display () {
        Set<Student> studentSet = studentList.keySet();
        for (Student student : studentSet) {
            System.out.println("Tên sinh viên: " + student.getName() + ", Số buổi vắng: " + studentList.get(student));
        }
    }
}
