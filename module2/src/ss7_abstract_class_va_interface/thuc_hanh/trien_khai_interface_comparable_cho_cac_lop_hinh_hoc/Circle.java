package ss7_abstract_class_va_interface.thuc_hanh.trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle () {
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled) {
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
}
