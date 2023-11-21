package ru.mirea.task18;

import java.util.Scanner;

public class AllTester {
    static Exception1 test1 = new Exception1();
    static Exception2 test2 = new Exception2();
    static Exception3 test3 = new Exception3();
    static Exception4 test4 = new Exception4();
    static Exception5 test5 = new Exception5();
    static Exception6 test6 = new Exception6();
    static Exception7 test7 = new Exception7();
    static Exception8 test8 = new Exception8();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("Выберите номер задания: 1-8. Нажмите 0 для выхода.");
            TaskNumber number = TaskNumber.fromValue(sc.nextLine());
            switch (number) {
                case FIRST: System.out.println("\n\t#1. 2 / 0");
                    test1.exceptionDemo(1);
                    System.out.println("\t#1. 2.0 / 0.0");
                    test1.exceptionDemo(2);
                    System.out.println("\t#2. Qwerty");
                    break;
                case SECOND:
                    test2.exceptionDemo("Qwerty");
                    System.out.println("\n\t#2. 0");
                    test2.exceptionDemo("0");
                    System.out.println("\t#2. 1");
                    test2.exceptionDemo("1");
                    break;
                case THIRD:
                    System.out.println("\n\t#3. 123");
                    test3.exceptionDemo("123");
                    System.out.println("\t#3. zzz");
                    test3.exceptionDemo("zzz");
                    break;
                case FOURTH:
                    System.out.println("\n\t#4. 123");
                    test4.exceptionDemo("123");
                    System.out.println("\t#4. zzz");
                    test4.exceptionDemo("zzz");
                    break;
                case FIFTH:
                    System.out.println("\n\t#5. ");
                    test5.test();
                    break;
                case SIXTH:
                    System.out.println("\n\t #6.");
                    test6.test();
                    break;
                case SEVENTH:
                    System.out.println("\n\t #7.");
                    test7.test();
                    break;
                case EIGHTH:
                    System.out.println("\t #8. empty");
                    test8.test("");
                    System.out.println("\t #8. data");
                    test8.test("data");
                    break;
                case END:
                    return;
                case NOT_FOUND:
                    System.out.println("Нет такого пункта меню, попробуйте ещё раз.");
                    break;
                }
        }
        while (true);
    }
}
