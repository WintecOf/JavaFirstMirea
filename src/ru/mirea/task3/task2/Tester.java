package ru.mirea.lab3.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        double x,y;
        String mode;
        System.out.println("Сколько окружностей создаём?: ");
        count = sc.nextInt();
        Circle[] arr = new Circle[count];
        System.out.println("Выберите режим работы: radius/length");
        mode = sc.next();

        for (int i=0; i < count; i++) {
            System.out.println("Введите координату x для окружности #" + (i+1));
            x = sc.nextDouble();
            System.out.println("Введите координату y для окружности #" + (i+1));
            y = sc.nextDouble();
            arr[i] = new Circle(new Point(x, y), mode);
        }

        for (int i=0; i < count; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
