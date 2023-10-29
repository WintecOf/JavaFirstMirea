package ru.mirea.task4.z4_1_1;

public class Triangle extends Shape {
    double a;
    double b;
    double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    String getType() {
        return "Треугольник";
    }
    Double getArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    Double getPerimeter() {
        return a+b+c;
    }

    public Triangle() {
        super.setColor("black");
        super.setFilled(false);
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Triangle(double a, double b, double c) {
        super("black", false);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Тип: " + this.getType() + " со сторонами " + this.getA() + ", " + this.getB() + ", " + this.getC() +
                "\n Площадь: " + this.getArea() +
                "\n Периметр: " + this.getPerimeter() + "\n";
    }
}