package ru.mirea.lab3.task1;

import java.util.Arrays;
import java.util.Random;

public class Random_from_class {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0;
        double[] rand1 = new double[10];
        for (i = 0; i < 10; i++) {
            rand1[i] = rand.nextDouble();
        }
        System.out.println("Массив случайных чисел типа double до сортировки:");
        for (i = 0; i < 10; i++) {
            System.out.println(rand1[i]);
        }
        Arrays.sort(rand1);
        System.out.println("Массив случайных чисел типа double после сортировки:");
        for (i = 0; i < 10; i++) {
            System.out.println(rand1[i]);
        }
    }
}
