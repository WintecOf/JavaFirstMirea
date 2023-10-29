package ru.mirea.lab3.task2;

import java.util.Formatter;

public class Circle implements Comparable<Circle>{
    Formatter f1 = new Formatter();
    Formatter f2 = new Formatter();
    Point center;
    double r;

    double len;


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

    public Circle(Point center, String mode) {
        this.center = center;
        switch (mode) {
            case ("radius") -> {
                this.r = Math.random() * 100;
                this.len = 2 * Math.PI * this.r;
            }
            case ("length") -> {
                this.len = Math.random() * 100;
                this.r = this.len / 2 / Math.PI;
            }
        }
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
                ", r=" + f2.format("%.2f", r) + ", l=" + f1.format("%.2f", len) +
                '}';
    }
    @Override
    public int compareTo(Circle compare) {
        int value = (int) compare.r*100;
        int this_val = (int) this.r*100;
        return this_val - value;
    }
}
