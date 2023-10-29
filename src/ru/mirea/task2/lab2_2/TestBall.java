package ru.mirea.lab2_2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        System.out.println("ball1: " + ball1.toString());;

        ball1.setXY(1.2, 22.1);
        System.out.println("ball1: " + ball1.toString());;

        Ball ball2 = new Ball(1.2, 5.3);
        System.out.println("ball2: " + ball2.toString());

        ball2.move(-3, +2.1);
        System.out.println("ball2: " + ball2.toString());
    }
}
