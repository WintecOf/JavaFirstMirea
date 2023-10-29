package ru.mirea.task13.n2;

public class Tester {
    public static void main(String[] args) {
        Person ivan = new Person("Ivan", "Danilov", "Ivanov");
        System.out.println(ivan.get_fio());
        Person oleg = new Person("Oleg", "Kishuk", "");
        System.out.println(oleg.get_fio());
        Person daniil = new Person("Daniil", "", "Petrovich");
        System.out.println(daniil.get_fio());
    }
}
