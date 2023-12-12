package ru.mirea.task29;

import java.util.Scanner;

/*
Входные данные
В первой строке задается число N (0 ≤ N ≤ 100). В следующих N строках содержится по N чисел,
каждое из которых является единичкой или ноликом. Причем, если в позиции (i,j) квадратной матрицы
стоит единичка, то i-ый и j-ый города соединены дорогами, а если нолик, то не соединены.

Выходные данные
Выведите одно число – количество дорог на планете "Neptune".


5
0 1 0 0 0
1 0 1 1 0
0 1 0 0 0
0 1 0 0 0
0 0 0 0 0
*/

public class Zadachka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            str = str.replaceAll(" ", "");
            count = count + str.substring(i).replaceAll("0", "").length();
        }
        System.out.println(count);
    }
}
