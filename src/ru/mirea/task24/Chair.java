package ru.mirea.task24;

public interface Chair {
    boolean isSeated = false;
    public void changeSeat();
    public boolean isSeated();

    @Override
    public String toString();
}
