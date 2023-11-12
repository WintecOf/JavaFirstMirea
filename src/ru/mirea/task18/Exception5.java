package ru.mirea.task18;

public class Exception5 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException(("null key in getDetails"));
            }
        } catch (Exception e) {
            System.out.println("An exception was caught:");
            System.out.println(e);
            return;
        }
        System.out.println("No error was thrown. Processing the key");
    }

    public void test() {
        Exception5 test = new Exception5();
        System.out.println("\nTest 1\n");
        test.getDetails("this is a key");
        System.out.println("\nTest 2\n");
        test.getDetails(null); //There is no key
    }
}

