package ru.mirea.lab2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1, 1, 1);
        Circle c2 = new Circle(2, 3, 4);
        Circle c3 = new Circle(2.3, 3.5, 4.1);
        System.out.println(c1);
        System.out.println(c2);
        c1.setR(2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c1.compare(c2));
    }
}
