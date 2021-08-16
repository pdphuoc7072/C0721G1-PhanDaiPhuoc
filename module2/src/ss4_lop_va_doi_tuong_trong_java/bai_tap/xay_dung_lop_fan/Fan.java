package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    private final int SlOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SlOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlOW () {
        return SlOW;
    }
    public int getMEDIUM () {
        return MEDIUM;
    }
    public int getFAST () {
        return FAST;
    }
    public int getSpeed () {
        return speed;
    }
    public boolean isOn () {
        return on;
    }
    public double getRadius () {
        return radius;
    }
    public String getColor () {
        return color;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }
    public void setOn (boolean on) {
        this.on = on;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public void setColor (String color) {
        this.color = color;
    }

    public Fan () {
    }
    public Fan (int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    @Override
    public String toString () {
        String status = "";
        if (this.isOn()) {
            status += ("Fan is on \n");
            status += ("Speed is " + this.speed + "\n");
        } else {
            status += ("Fan is off \n");
        }
        status += ("Radius is " + this.radius + "\n");
        status += ("Color is " + this.color + "\n");
        return status;
    }
}
