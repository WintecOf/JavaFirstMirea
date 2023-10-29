package ru.mirea.task13.n5;

public class Number {
    String number;
    Number(String n) {
        if (n.charAt(0) == '+') {
            int len = n.length();
            number = "+" + n.substring(1, len-10) + " " + n.substring(len - 10, len - 7) + "-" + n.substring(len - 7, len - 4) + "-" + n.substring(len - 4, len);
        }
        else {
            number = "+7 " + n.substring(1, 4) + "-" + n.substring(4, 7) + "-" + n.substring(8, 11);
        }
    }

    @Override
    public String toString() {
        return number;
    }
}
