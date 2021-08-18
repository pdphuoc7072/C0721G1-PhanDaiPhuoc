package ss7_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(4.5, "blue", false);
        System.out.println(circle);
    }
}
