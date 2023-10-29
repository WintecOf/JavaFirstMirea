package ru.mirea.lab3.task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 0;
        while (true) {
            System.out.println("Введите натуральное число.");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (0 < n) {
                    break;
                }
                else {
                    System.out.println("Введено не натуральное число, попробуйте ещё раз.");
                    sc = new Scanner(System.in);
                }
            }
            else {
                System.out.println("Введено не число, попробуйте ещё раз.");
                sc = new Scanner(System.in);
            }
        }
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = (int) Math.round(Math.random()*n);
        }
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(i + " : " + arr[i]);
            };
        }
    }
}
