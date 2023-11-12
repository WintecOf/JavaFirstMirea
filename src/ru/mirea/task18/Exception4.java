package ru.mirea.task18;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo(String input) {
        try {
            int i = Integer.parseInt(input);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("New exception arrived:");
            System.out.println(e);
        }
        finally {
            System.out.println("Message after success or failure.");
        }
    }
}
