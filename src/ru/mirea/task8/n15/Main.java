package ru.mirea.task8.n15;

import java.util.Scanner;

public class Main {
    public static int reverse(int value) {
        int result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println(reverse(number));
    }
}
