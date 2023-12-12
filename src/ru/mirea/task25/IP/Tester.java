package ru.mirea.task25.IP;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!Objects.equals(input, "end")) {
            if (isValidIP(input)) {
                System.out.println("Введённый IP адрес соответствует стандарту");
            }
            else {
                System.out.println("Введённый IP адрес не соответствует стандарту");
            }
            input = sc.next();
        }
    }

    public static boolean isValidIP(String ip) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
