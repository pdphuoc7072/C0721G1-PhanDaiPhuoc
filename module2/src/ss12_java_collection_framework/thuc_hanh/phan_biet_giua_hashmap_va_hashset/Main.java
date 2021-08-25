package ss12_java_collection_framework.thuc_hanh.phan_biet_giua_hashmap_va_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Phước", 31, "Đà Nẵng");
        Student student2 = new Student("Kiệt", 23, "Quảng Nam");
        Student student3 = new Student("Bình", 25, "Hà Nội");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("...........Set");

        Set<Student> studentSet = new HashSet<Student>();

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student : studentSet) {
            System.out.println(student.toString());
        }
    }
}
