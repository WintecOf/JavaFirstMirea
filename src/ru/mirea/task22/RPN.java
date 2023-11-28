package ru.mirea.task22;

import java.util.*;

public class RPN {
    public static double evaluate(String expr) {
        if (expr.isEmpty()) return 0;

        int start = 0;

        Stack stack = new Stack();

        do
        {
            int space = expr.substring(start).indexOf(' ');
            int end = space == -1 ? expr.length() : start + space;
            String current = expr.substring(start,end);//Текущее число или операнд
            if("+-*/".indexOf(current.charAt(0)) != -1)// Проверяем является ли current операндом
            {//Если да, удаляем два числа и добавляем результат
                double a = stack.pop();
                double b = stack.pop();
                stack.push(operate(current.charAt(0),b,a));
            }
            else
            { //Иначе добавляем число
                stack.push(Double.parseDouble(current));
            }
            start = end + 1;//Продолжаем с числа после пробела
        }while(start < expr.length());

        double result = stack.pop();

        //Если после всех операций стэк не пуст, выводим наибольшее число
        while(!stack.isEmpty())
        {
            double current = stack.pop();
            result = Math.max(current, result);
        }

        return result;
    }
    //Возвращает результат воздействия операнда на a и b
    public static double operate(char operand,double a, double b){

        Hashtable<Character,Double> opHash = new Hashtable<>();
        opHash.put('+',a + b);
        opHash.put('-',a - b);
        opHash.put('*',a * b);
        opHash.put('/',a / b);

        return opHash.get(operand);
    }
}
