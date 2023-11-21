package ru.mirea.task20.Task4;

public class Tester {

    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        MinMax<Integer> integerMinMax = new MinMax<>(intArray);

        System.out.println("min: " + integerMinMax.findMin());
        System.out.println("max: " + integerMinMax.findMax());

        Double[] doubleArray = {3.14, 2.71, 1.618, 0.577, 2.718};
        MinMax<Double> doubleMinMax = new MinMax<>(doubleArray);

        System.out.println("min: " + doubleMinMax.findMin());
        System.out.println("max: " + doubleMinMax.findMax());

        String[] strArray = {"alpha", "beta", "charlie"};
        MinMax<String> stringMinMax = new MinMax<>(strArray);

        System.out.println("min: " + stringMinMax.findMin());
        System.out.println("max: " + stringMinMax.findMax());

        System.out.println("\n================================\n");

        int intOperand1 = 5;
        int intOperand2 = 3;

        double doubleOperand1 = 7.5;
        double doubleOperand2 = 2.5;

        System.out.println("Сумма: " + Calculator.sum(intOperand1, intOperand2));
        System.out.println("Умножение: " + Calculator.multiply(intOperand1, intOperand2));
        System.out.println("Деление: " + Calculator.divide(intOperand1, intOperand2));
        System.out.println("Вычитание: " + Calculator.subtraction(intOperand1, intOperand2));

        System.out.println("Сумма: " + Calculator.sum(intOperand1, doubleOperand1));
        System.out.println("Умножение: " + Calculator.multiply(intOperand1, doubleOperand2));
        System.out.println("Деление: " + Calculator.divide(doubleOperand1, intOperand2));
        System.out.println("Вычитание: " + Calculator.subtraction(doubleOperand1, intOperand2));
    }

}
