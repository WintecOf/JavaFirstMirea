package ru.mirea.task26.Task1;

import java.util.Stack;

public class ArrayInverter {
    public static void invertArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Заполняем стек элементами из исходного массива
        for (int element : array) {
            stack.push(element);
        }

        // Заменяем элементы в исходном массиве значениями из стека
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив:");
        printArray(originalArray);

        invertArray(originalArray);

        System.out.println("Инвертированный массив:");
        printArray(originalArray);
    }
}