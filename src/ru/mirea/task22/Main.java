package ru.mirea.task22;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Калькулятор в обратной польской нотации");
        System.out.println("Введи 'exit' для выхода");
        String input;
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("Введи выражение в обратной польской нотации");
            System.out.print("-> ");
            input = sc.nextLine();
            if (Objects.equals(input, "exit")) {
                return;
            }
            try{
                System.out.println(RPN.evaluate(input));
            } catch (NullPointerException e) {
                System.out.println("Невозможно выполнить POP для пустого стека\nПопробуй ещё раз или введи 'exit' для выхода\"");
            } catch(Exception e)
            {
                System.out.println("Недопустимое выражение\nПопробуй ещё раз или введи 'exit' для выхода");
            }
        }
    }
}