package ru.mirea.task8.n16;

import java.util.Scanner;

public class Main {
    public static int count_max() {
        Scanner sc = new Scanner(System.in);

        int input, c = 1, max = (int) Double.NEGATIVE_INFINITY;

        while (true) {
            input = sc.nextInt();
            if (input == 0) {
                break;
            }
            if (input > max) {
                max = input;
                c = 1;
            } else if (input == max) {
                c += 1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(count_max());
    }
}
