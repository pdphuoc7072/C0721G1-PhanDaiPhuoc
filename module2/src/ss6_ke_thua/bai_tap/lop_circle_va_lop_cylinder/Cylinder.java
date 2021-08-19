package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder () {
        this(1.0);
    }
    public Cylinder (double height) {
        this.height = height;
    }
    public Cylinder (double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight () {
        return this.height;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    public double getVolume () {
        return this.height * super.getArea();
    }
    @Override
    public String toString () {
        return "Hình trụ có height = " + getHeight() + ", có thể tích = " + getVolume() + " là lớp con của " + super.toString();
    }
}
