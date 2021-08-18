package ss7_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparator_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare (Rectangle r1, Rectangle r2) {
        if (r1.getPerimeter() > r2.getPerimeter()) {
            return 1;
        } else if (r1.getPerimeter() < r2.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
