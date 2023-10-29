package ru.mirea.lab3.task3;

public class Tester {
    public static void main(String[] args) {
        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = (int) Math.round(Math.random()*89+10);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);;
        }
        if (Tester.isUp(arr)) {
            System.out.println("Массив является строго возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
    public static boolean isUp(int[] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] <= arr[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
