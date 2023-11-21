package ru.mirea.task20.Task4;

public class Calculator {
    public static <T extends Number, S extends Number> double sum(T a, S b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, S extends Number> double subtraction(T a, S b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, S extends Number> double multiply(T a, S b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, S extends Number> double divide(T a, S b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return a.doubleValue() / b.doubleValue();
    }
}
