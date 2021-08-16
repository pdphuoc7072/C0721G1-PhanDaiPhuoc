package _4_Lop_Va_Doi_Tuong_Trong_Java.bai_tap;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan (3, true, 10, "yellow");
        Fan fan2 = new Fan (2, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
