package ru.mirea.lab3.task1;

import java.util.Arrays;
import java.util.Random;

public class Math_random {
    public static void main(String[] args) {
        int i = 0;
        double[] rand2 = new double[10];
        for (i = 0; i < 10; i++) {
            rand2[i] = Math.random();
        }
        System.out.println("Массив случайных чисел типа double до сортировки:");
        for (i = 0; i < 10; i++) {
            System.out.println(rand2[i]);
        }
        Arrays.sort(rand2);
        System.out.println("Массив случайных чисел типа double после сортировки:");
        for (i = 0; i < 10; i++) {
            System.out.println(rand2[i]);
        }
    }
}
