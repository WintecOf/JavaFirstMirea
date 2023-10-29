package ru.mirea.task11.n1;

import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        long time = System.currentTimeMillis() - 1000*60*60*24*7;
        Date get = new Date(time);
        System.out.println("Кучеренко");
        System.out.println("Получил задание: " + get.getDate() + "." + (get.getMonth()+1) + "." + (get.getYear() + 1900) + " / " + get.getHours() + ":" + get.getMinutes());
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Выполнил задание: " + date.getDate() + "." + (date.getMonth()+1) + "." + (date.getYear() + 1900) + " / " + date.getHours() + ":" + date.getMinutes());
    }
}
