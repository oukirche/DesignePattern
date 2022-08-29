package org.oukirche.prototype;

public class Point implements Cloneable{
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt((x * p.x)+(y * p.y));
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
