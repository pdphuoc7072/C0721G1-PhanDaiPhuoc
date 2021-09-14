package bai_tap_huong_doi_tuong.bai_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();
    public void add () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập mã số sinh viên: ");
        String idOfStudent = scanner.nextLine();
        System.out.print("Hãy nhập họ tên sinh viên: ");
        String fullName = scanner.nextLine();
        System.out.print("Hãy nhập ngày sinh của sinh viên: ");
        String birthday = scanner.nextLine();
        System.out.print("Hãy nhập giới tính của sinh viên: ");
        String gender = scanner.nextLine();
        System.out.print("Hãy nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        System.out.print("Hãy nhập khóa học: ");
        String course = scanner.nextLine();
        studentList.add(new Student(idOfStudent, fullName, birthday, gender, nameClass, course));
    }
    public void print () {
       for (int i = 0; i < studentList.size(); i++) {
           System.out.println((i+1) + ". " + studentList.get(i).toString());
       }
    }
    public void remove (String idOfStudent) {
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getIdOfStudent().equals(idOfStudent)) {
                flag = true;
                studentList.remove(student);
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sinh viên cần xóa trong danh sách sinh viên.");
        }
    }
    public void remove (int number) {
        boolean flag = false;
        for (int i = 0; i < studentList.size(); i++) {
            studentList.remove(studentList.get(number-1));
            flag = true;
            break;
        }
        if (!flag) {
            System.out.println("Không tìm thấy sinh viên cần xóa ở vị trí " + number + " trong danh sách sinh viên.");
        }
    }
    public void search (String string) {
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getIdOfStudent().equals(string)) {
                System.out.println(student.toString());
                flag = true;
                break;
            }
            if (student.getFullName().equals(string)) {
                System.out.println(student.toString());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sinh viên cần tìm trong danh sách sinh viên.");
        }
    }
    public void sort () {
        Collections.sort(studentList);
        print();
    }
}
