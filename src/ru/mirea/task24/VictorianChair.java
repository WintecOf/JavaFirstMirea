package ru.mirea.task24;

public class VictorianChair implements Chair {
    boolean isSeated = false;
    int age;
    public boolean isSeated() {
        return isSeated;
    }
    public void changeSeat() {
        isSeated = !isSeated;
    }

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Victorian chair [Seated: " + isSeated + ", age: " + age + "]";
    }
}
