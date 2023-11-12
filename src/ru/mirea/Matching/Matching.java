package ru.mirea.Matching;

import java.util.*;

public class Matching {
    static String sequence = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            do  {
                System.out.print("Enter brackets sequence: ");
                sequence = sc.nextLine();
                if (Objects.equals(sequence, "end")) {
                    return;
                }
            } while (!containsOnlyBrackets());
            if (checkBracketsValid()) {
                System.out.println("Valid brackets sequence");
            } else {
                System.out.println("Invalid brackets sequence");
            }
        }
    }

    public static boolean containsOnlyBrackets() {
        for (char ch : sequence.toCharArray()) {
            if (!isBracket(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBracket(char ch) {
        return ch == '{' || ch == '}' || ch == '[' || ch == ']' || ch == '(' || ch == ')';
    }

    private static boolean checkBracketsValid() {
        Stack<Character> stack = new Stack<>();
        for (char ch: sequence.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isCloseBracket(ch)) {
                if (stack.isEmpty() || !areMatchingBrackets(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char ch) {
        return ch == '[' || ch == '{' || ch == '(';
    }

    private static boolean isCloseBracket(char ch) {
        return ch == '}' || ch == ']' || ch == ')';
    }

    private static boolean areMatchingBrackets(char open, char close) {
        return (open == '{' && close == '}') || (open == '[' && close == ']') || (open == '(' && close == ')');
    }
}
