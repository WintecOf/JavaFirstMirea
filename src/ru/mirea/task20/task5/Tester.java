package ru.mirea.task20.task5;

public class Tester {
    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        Matrix<Integer> m1 = new Matrix<>(data1);
        System.out.println(m1);
        Integer[][] data2 = {{7, 8, 9}, {0, 1, 2}};
        Matrix<Integer> m2 = new Matrix<>(data2);
        System.out.println(m2);
        Matrix<Integer> m3 = m1.add(m2);
        System.out.println(m3);
    }
}
