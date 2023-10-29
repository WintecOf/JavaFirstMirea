package ru.mirea.task7.num5;

public class Tester {
    public static void main(String[] args) {
        ProcessableString ps = new ProcessString("lorem ipsum dolor sit amet");
        System.out.println(ps);
        System.out.println(ps.inverted());
        System.out.println(ps.odd());
        System.out.println(ps.count());
    }
}
