package ru.mirea.task24;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicChair createMagicChair();
    public FunctionalChair createFunctionalChair();
}
