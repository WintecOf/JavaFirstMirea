package ru.mirea.task18;

import java.util.Objects;
import java.util.Scanner;

public class Exception7 {
    public void getKey() {
        Scanner myScanner=  new  Scanner(  System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) {
        if(Objects.equals(key, ""))           {
            try {
                throw new Exception( "Key set to empty string" );
            } catch (Exception e) {
                System.out.println("Exception appeared:" + e);
            }
        }
        return "data for " + key;
    }

    public void test() {
        Exception7 test = new Exception7();
        test.printDetails("data");
        test.printDetails("");
    }
}

