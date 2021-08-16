package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        System.out.println("Diện tích hình tròn có bán kính = " + circle.getRadius() + " là: " + circle.getArea());
        circle.setRadius(20);
        System.out.println("Diện tích hình tròn có bán kính = " + circle.getRadius() + " là: " + circle.getArea());
        Circle circle1 = new Circle();
        circle1.setRadius(15);
        System.out.println("Diện tích hình tròn 1 có bán kính = " + circle1.getRadius() + " là: " + circle1.getArea());
    }
}
