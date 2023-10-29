//Пункт 4
package ru.mirea.task1.Lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите 10 чисел");
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        int i = 0;
        double sum = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        while (i < arr.length) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = sc.nextInt();
            i++;
        }
        i = 0;
        do {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        } while (i < arr.length);

        System.out.println("sum = "+sum);
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}
