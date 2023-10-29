package ru.mirea.lab3.task2_1;

public class Tester {
    public static void main(String[] args) {
        double d1 = Double.valueOf("2.4");
        double d2 = Double.valueOf("2.7");

        String s = "1.1";
        double d3 = Double.parseDouble(s);

        byte by = (byte) d3;
        int in = (int) d3;
        char ch = (char) d3;
        float fl = (float) d3;
        long lo = (long) d3;
        short sh = (short) d3;

        System.out.println(d3);
        String d = Double.toString(3.14);

        System.out.println(d);
    }

}
