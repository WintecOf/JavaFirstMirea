package ru.mirea.task18;

import java.sql.SQLOutput;

public class Exception1 {
    public void exceptionDemo(int type) {
        if (type == 1) {
            try {
                System.out.println(2.0 / 0.0);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
        else {
            try {
                System.out.println(2 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }
}
