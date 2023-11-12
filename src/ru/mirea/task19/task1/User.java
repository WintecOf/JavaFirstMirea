package ru.mirea.task19.task1;

public class User {
    private String INN;
    private String name;

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String INN, String name) {
        this.INN = INN;
        this.name = name;
    }
}
