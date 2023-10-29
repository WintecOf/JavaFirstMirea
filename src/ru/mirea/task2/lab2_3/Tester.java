package ru.mirea.lab2_3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        double x,y,r;
        System.out.println("Сколько окружностей создаём?: ");
        count = sc.nextInt();
        Circle[] arr = new Circle[count];
        for (int i=0; i < count; i++) {
            System.out.println("Введите координату x для окружности #" + (i+1));
            x = sc.nextDouble();
            System.out.println("Введите координату y для окружности #" + (i+1));
            y = sc.nextDouble();
            System.out.println("Введите радиус для окружности #" + (i+1));
            r = sc.nextDouble();
            arr[i] = new Circle(new Point(x, y), r);
        }

        for (int i=0; i < count; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
