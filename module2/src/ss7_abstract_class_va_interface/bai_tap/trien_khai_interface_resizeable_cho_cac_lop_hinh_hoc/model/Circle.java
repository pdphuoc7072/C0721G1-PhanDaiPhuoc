package ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.model;

import ss7_abstract_class_va_interface.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc.service.IResizeableService;

public class Circle extends Shape implements IResizeableService {
    private double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius () {
        return this.radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter () {
        return 2 * this.radius * Math.PI;
    }
    @Override
    public String toString () {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }
    @Override
    public void resize (double percent) {
        setRadius(getRadius() * (1 + percent / 100));
    }
}
