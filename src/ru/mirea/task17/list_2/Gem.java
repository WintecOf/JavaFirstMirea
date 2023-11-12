package ru.mirea.task17.list_2;

import java.util.Scanner;

public class Gem {
    private int id;
    private Rarity rarity = Rarity.NOT_FOUND;
    private Size size = Size.NOT_FOUND;
    private Color color = Color.NOT_FOUND;

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Gem(Rarity rarity, Size size, Color color, int id) {
        this.rarity = rarity;
        this.size = size;
        this.color = color;
        this.id = id;
    }

    public Gem() {
        readFromConsole();
    }

    public void readFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        this.id = Integer.parseInt(sc.nextLine());
        do {
            System.out.println("Enter Rarity");
            setRarity(Rarity.fromValue(sc.nextLine()));
        } while (this.rarity.equals(Rarity.NOT_FOUND));
        do {
            System.out.println("Enter Size");
            setSize(Size.fromValue(sc.nextLine()));
        } while (this.size.equals(Size.NOT_FOUND));
        do {
            System.out.println("Enter Color");
            setColor(Color.fromValue(sc.nextLine()));
        } while (this.color.equals(Color.NOT_FOUND));

    }
    @Override
    public String toString() {
        return "Gem [ID: " + this.id + ",Rarity: " + this.getRarity() + ", Size: " + this.getSize() + ", Color: " + this.getColor() + "]";
    }
}
