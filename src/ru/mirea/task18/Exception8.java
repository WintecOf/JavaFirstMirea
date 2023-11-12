package ru.mirea.task18;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Exception8 {
    static Scanner sc = new Scanner(System.in);
    public void getKey() {
        Scanner myScanner=  new  Scanner(  System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String input) {
            try {
                String message = getDetails(input);
                System.out.println(message);
            } catch (Exception e) {
                System.out.println("Invalid input, try again: " + e + " Try again.");
            }
    }
    private String getDetails(String key) {
        if (Objects.equals(key, "")) {
            throw new NullPointerException("empty key field in getDetails.");
        }
        return "data for " + key;
    }

    public void test(String input) {
        Exception8 test = new Exception8();
        test.printDetails(input);
    }
}