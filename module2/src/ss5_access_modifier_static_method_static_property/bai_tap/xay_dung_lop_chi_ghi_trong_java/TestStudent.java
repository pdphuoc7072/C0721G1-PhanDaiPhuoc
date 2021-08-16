package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getName() + " học ở lớp " + student1.getClasses());
        Student student2 = new Student();
        student2.setName("Phước");
        student2.setClasses("C07");
        System.out.println(student2.getName() + " học ở lớp " + student2.getClasses());
    }
}
