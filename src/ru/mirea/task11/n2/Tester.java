package ru.mirea.task11.n2;

import java.util.Date;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date reference = new Date();
        Date system = new Date(System.currentTimeMillis());
        int day, month, year, hour, minutes;

        while (true) {
            System.out.println("Введите день (1-31)");
            day = sc.nextInt();
            if (1 <= day && day<= 31) {
                break;
            }
        }

        while (true) {
            System.out.println("Введите месяц 1-12");
            month = sc.nextInt();
            if (1 <= month && month<= 12) {
                break;
            }
        }

        while (true) {
            System.out.println("Введите год >= 0");
            year = sc.nextInt();
            if (0 <= year) {
                break;
            }
        }

        while (true) {
            System.out.println("Введите час 0-23");
            hour = sc.nextInt();
            if (0 <= hour && hour <= 23) {
                break;
            }
        }

        while (true) {
            System.out.println("Введите минуты 0-59");
            minutes = sc.nextInt();
            if (0 <= minutes && minutes <= 59) {
                break;
            }
        }

        Date user = new Date((long) year *365*24*60*60*1000 + (long) month *31*24*60*60*1000 + (long) day *24*60*60*1000 + hour*60*60*1000 + minutes*60*1000);

        if (reference.before(user)) {
            System.out.println("Введенная дата позже референса");
        }
        else {
            System.out.println("Введенная дата раньше референса");
        }

        if (reference.before(system)) {
            System.out.println("Системная дата позже референса");
        }
        else {
            System.out.println("Системная дата раньше референса");
        }
    }
}
