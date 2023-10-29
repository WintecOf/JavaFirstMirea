package ru.mirea.task8.n17;

import java.util.Scanner;

public class Main {
    public static int find_max() {
        Scanner sc = new Scanner(System.in);

        int input, max = (int) Double.NEGATIVE_INFINITY;

        while (true) {
            input = sc.nextInt();
            if (input == 0) {
                break;
            }
            if (input > max) {
                max = input;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        System.out.println(find_max());
    }
}
