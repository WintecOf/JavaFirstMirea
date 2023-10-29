package ru.mirea.task4.z4_1_1;

public class Tester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.3);
        Rectangle rectangle1 = new Rectangle(4,5);
        Triangle triangle1 = new Triangle(4,5, 8);
        System.out.println(circle1);
        System.out.println(rectangle1);
        System.out.println(triangle1);

        System.out.println("-------------\n");

        Circle circle2 = new Circle(5.3, "red", true);
        Rectangle rectangle2 = new Rectangle(4,5, "blue", false);
        Triangle triangle2 = new Triangle(4,5, 8, "green", true);
        System.out.println(circle2);
        System.out.println(rectangle2);
        System.out.println(triangle2);

        System.out.println("-------------\n");

        Circle circle3 = new Circle();
        Rectangle rectangle3 = new Rectangle();
        Triangle triangle3 = new Triangle();
        System.out.println(circle3);
        System.out.println(rectangle3);
        System.out.println(triangle3);
    }
}
