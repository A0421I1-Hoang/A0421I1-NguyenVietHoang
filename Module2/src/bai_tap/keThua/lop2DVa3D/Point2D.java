package bai_tap.keThua.lop2DVa3D;

public class Point2D {
    private float x;
    private float y;
    Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float getXY(){
        return this.x*this.y;
    }
    public void setXY(){
        
    }
}
