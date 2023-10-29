//Пункт 3
package ru.mirea.task1.Lab1;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("Введите 10 чисел");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // Инициализация как в Си
        int i;
        int sum = 0;
        double avg;
        for (i=0; i<arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        for (i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + avg);
    }
}
