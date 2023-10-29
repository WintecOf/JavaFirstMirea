package ru.mirea.task14.n3;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дан текст со списками цен. Извлечь из него цены в USD, RUВ, EUR.
public class Tester {
    public static void main(String[] args) {
        String regex = "(\\d+\\.\\d{2})\\s+(EUR|USD|RUB)";
        String input = "Цена этого товара 22.15 RUB. Цена другого товара 1599.99 USD.";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Цена: " + m.group(1) + " " + m.group(2));
        }
    }
}
