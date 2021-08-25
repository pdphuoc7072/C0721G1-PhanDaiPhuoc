package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.controller;

import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.model.Circle;
import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.model.Rectangle;
import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.model.Shape;
import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.service.IColorableService;
import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.service.SquareService;

import java.util.Scanner;

public class TestColorable {
    public static Shape getRandomShape () {
        int random = (int) (Math.round(Math.random()*3));
        switch (random) {
            case 0:
                return new Circle(2.7);
            case 1:
                return new Rectangle(4.4, 3.3);
            default:
                return new SquareService(3.5);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn tạo bao nhiêu hình học: ");
        int size = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            shapes[i] = getRandomShape();
        }
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                System.out.println("Có diện tích là: " + ((Circle) shape).getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Có diện tích là: " + ((Rectangle) shape).getArea());
            }
            if (shape instanceof IColorableService) {
                ((IColorableService) shape).howToColor();
            }
            System.out.println();
        }
    }
}
