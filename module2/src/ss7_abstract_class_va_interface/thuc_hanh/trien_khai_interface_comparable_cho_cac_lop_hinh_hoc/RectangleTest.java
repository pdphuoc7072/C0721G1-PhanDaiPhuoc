package ss7_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(10.0, 5.0);
        System.out.println(rectangle);
        rectangle = new Rectangle(20.0, 15.0, "yellow", false);
        System.out.println(rectangle);
    }
}
