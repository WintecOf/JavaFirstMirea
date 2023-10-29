package ru.mirea.lab2_3;

import java.util.Formatter;

public class Circle {
    Formatter f = new Formatter();
    Point center;
    double r;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getLength() {
        double c;
        c = 2*Math.PI*r;
        return c;
    }

    @Override
    public String toString() {
        return "Circle{" +
            "x=" + center.getX() +", y=" + center.getY() +
            ", r=" + r + ", l=" + f.format("%.2f", this.getLength()) +
            '}';
    }
}
