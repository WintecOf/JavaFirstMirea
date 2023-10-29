// Пункт 6
package ru.mirea.task1.Lab1;

public class Task3 {
    public static void main(String[] args) {
        double num = 1;
        for (int i = 2; i < 12; i++) {
            System.out.printf("%.3f\n", num);
            num += 1.0/i;
        }
    }
}
