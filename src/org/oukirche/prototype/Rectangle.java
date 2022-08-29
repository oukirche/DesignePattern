package org.oukirche.prototype;

public class Rectangle extends Figure{


    public Rectangle(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    public double surface() {
        int l =  Math.abs(p1.getX() - p2.getX());
        int h  = Math.abs(p1.getY() - p2.getY());
        return l*h;
    }

    @Override
    public String toString() {
        return "Rectangle : "+super.toString();
    }
}
