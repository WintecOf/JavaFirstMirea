package ru.mirea.task18;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo(String input) {
        int i;
        try {
            i = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format");
            return;
        }
        try {
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
