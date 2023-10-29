package ru.mirea.task4.z4_1_1;

public class Circle extends Shape {
    double Radius;
    String getType() {
        return "Окружность";
    }
    Double getArea() {
        return Math.PI* Radius * Radius;
    }

    Double getPerimeter() {
        return 2*Math.PI* Radius;
    }

    Circle() {
        super("black", false);;
        this.Radius = 1;
    }
    Circle(double Radius) {
        super("black", false);
        this.Radius = Radius;
    }

    public Circle(double Radius, String color, boolean filled) {
        super(color, filled);
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Тип: " + this.getType() + " с радиусом " + Radius +
                "\n Площадь: " + this.getArea() +
                "\n Периметр: " + this.getPerimeter() + "\n";
    }
}
