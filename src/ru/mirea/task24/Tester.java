package ru.mirea.task24;

public class Tester {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Client cl = new Client();

        cl.setChair(factory.createMagicChair());
        cl.sit();
        System.out.println(cl.chair);

        cl.setChair(factory.createVictorianChair(10));
        System.out.println(cl.chair);
    }
}
