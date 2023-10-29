package ru.mirea.task4.z4_1_1;

abstract class Shape {
    String color;
    Boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    abstract Double getArea();
    abstract Double getPerimeter();

    public Shape() {

    }
    public String toString() {
        return "Фигура, заливка: " + filled + ", цвет: " + color;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }



}
