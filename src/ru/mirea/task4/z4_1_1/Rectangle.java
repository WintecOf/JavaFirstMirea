package ru.mirea.task4.z4_1_1;

public class Rectangle extends Shape {
    double a;
    double b;

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

    String getType() {
        return "Прямоугольник";
    }
    Double getArea() {
        return a * b;
    }

    Double getPerimeter() {
        return 2*(a + b);
    }

    public Rectangle() {
        super("black", false);
        this.a = 10;
        this.b = 15;
    }
    public Rectangle(double a, double b) {
        super("black", false);
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return super.toString() +
                "\n Тип: " + this.getType() + " со сторонами " + this.getA() + ", " + this.getB() +
                "\n Площадь: " + this.getArea() +
                "\n Периметр: " + this.getPerimeter() + "\n";
    }
}