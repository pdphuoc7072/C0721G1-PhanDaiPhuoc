package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;
    public Circle () {
        this(1.0, "red");
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public Circle (double radius, String color) {
        this.radius = radius;
        this.color = color;
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
}
