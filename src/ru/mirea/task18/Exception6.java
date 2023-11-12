package ru.mirea.task18;

public class Exception6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public void test() {
        Exception6 test = new Exception6();
        try {
            test.printMessage("dividers");
            test.printMessage(null);
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e);
        }
    }
}
