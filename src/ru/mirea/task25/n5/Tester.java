package ru.mirea.task25.n5;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//05.12.2004
//12/05/2002

//Написать регулярное выражение, определяющее является ли данная строчка
//датой в формате dd/mm/yyyy. Начиная с 1900 года до 9999 года.
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        while (!Objects.equals(input, "end")) {
            if (isValidData(input)) {
                System.out.println("Введённая дата соответствует стандарту");
            }
            else {
                System.out.println("Введённая дата не соответствует стандарту");
            }
            input = sc.next();
        }
    }

    public static boolean isValidData(String email) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
