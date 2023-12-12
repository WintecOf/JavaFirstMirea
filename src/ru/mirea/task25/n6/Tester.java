package ru.mirea.task25.n6;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать регулярное выражение, определяющее является ли данная строчка
//допустимым (корректным) е-mail адресом согласно RFC под номером 2822.
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!Objects.equals(input, "end")) {
            if (isValidEmail(input)) {
                System.out.println("Введённый email соответствует стандарту");
            }
            else {
                System.out.println("Введённый email не соответствует стандарту");
            }
            input = sc.next();
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
