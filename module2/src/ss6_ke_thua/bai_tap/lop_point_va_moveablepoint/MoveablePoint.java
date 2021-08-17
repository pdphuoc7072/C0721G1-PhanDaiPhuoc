package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint () {
    }
    public MoveablePoint (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint (float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed () {
        return this.xSpeed;
    }
    public void setXSpeed (float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed () {
        return this.ySpeed;
    }
    public void setYSpeed (float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed () {
        float[] array = new float[2];
        array[0] = getXSpeed();
        array[1] = getYSpeed();
        return array;
    }
    @Override
    public String toString () {
        return super.toString() + ", speed = (" + getXSpeed() + ", " + getYSpeed() + ")";
    }
    public MoveablePoint move () {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        return this;
    }
}
