package ru.mirea.task9.n2;

import java.util.Arrays;
import java.util.Random;


public class SortingStudentsByGPA {
    public static void quickSort(Student[] list, int low, int high) {
        if (list.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        Student opora = list[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (list[i].compareTo(opora) < 0) {
                i++;
            }

            while (list[j].compareTo(opora) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(list, low, j);

        if (high > i)
            quickSort(list, i, high);
    }
    public static void main(String[] args){
        Student[] x = new Student[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            double gpa = (double) Math.round(r.nextDouble(5) * 10) /10;
            String name = "name" + i;
            x[i] = new Student(gpa, name);
        }
        System.out.println("Было:");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}
