package ru.mirea.lab2_6;

import java.util.Formatter;

public class Circle {
    double x;
    double y;
    double r;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        if (r < 0) {
            System.out.println("Радиус окружности не может быть отрицательным");
            System.exit(0);
        } else this.r = r;
    }

    public double getLength() {
        double c;
        c = 2*Math.PI*r;
        return c;
    }

    public double getSquare() {
        double s;
        s = Math.PI*r*r;
        return s;
    }

    public String compare(Circle another) {
        double distance = Math.sqrt(Math.pow(this.x - another.getX(), 2) + Math.pow(this.y - another.getY(), 2));
        double square_diff = this.getSquare() - another.getSquare();
        double len_diff = this.getLength() - another.getLength();
        return new Formatter().format("Расстояние = %.2f, Площадь = %.2f, Длина = %.2f", distance, square_diff, len_diff).toString();
    }

    @Override
    public String toString() {
        Formatter f = new Formatter();
        return f.format("Circle {x=%f, y=%f, r=%f, l=%.2f, s=%.2f}", x, y, r, this.getLength(), this.getLength()).toString();
    }
}