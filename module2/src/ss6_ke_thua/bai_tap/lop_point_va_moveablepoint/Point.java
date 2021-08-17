package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

import org.omg.PortableServer.POA;

public class Point {
    private float x;
    private float y;
    public Point () {
    }
    public Point (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX () {
        return this.x;
    }
    public void setX (float x) {
        this.x = x;
    }
    public float getY () {
        return this.y;
    }
    public void setY (float y) {
        this.y = y;
    }
    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY () {
        float[] array = new float[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }
    @Override
    public String toString () {
        return "(x, y) = (" + getX() + ", " + getY() + ")";
    }
}
