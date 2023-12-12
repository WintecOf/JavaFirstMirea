package ru.mirea.task25.Arithmetic;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!Objects.equals(input, "end")) {
            if (isValidExpression(input)) {
                System.out.println("Введённое выражение удовлетворяет условию");
            }
            else {
                System.out.println("Введённое выражение не удовлетворяет условию");
            }
            input = sc.next();
        }
    }

    public static boolean isValidExpression(String expression) {
        String regex = "^([^()]*\\([^()]*\\)[^()]*)*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        return matcher.matches();
    }
}
