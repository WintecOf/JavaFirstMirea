package ru.mirea.task13.n1;

public class Tester {
    public static void main(String[] args) {
        check("I Like Java!!!");
    }

    public static void check(String text) {
        System.out.println("Testing line: " + text);
        System.out.println(text.charAt(text.length()-1));
        System.out.println(text.endsWith("!!!"));
        System.out.println(text.startsWith("I Like"));
        System.out.println(text.contains("Java"));
        System.out.println(text.indexOf("Java"));
        System.out.println(text.replaceAll("a", "o"));
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
