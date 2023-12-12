package ru.mirea.task24;

public class FunctionalChair {
    boolean isSeated;
    public boolean isSeated() {
        return isSeated;
    }
    public void changeSeat() {
        isSeated = !isSeated;
    }

    public FunctionalChair() {
        isSeated = false;
    }

    public int sum(int a, int b) {
        return a + b;
    }
    @Override
    public String toString() {
        return "Functional chair [Seated: " + isSeated +"]";
    }
}
