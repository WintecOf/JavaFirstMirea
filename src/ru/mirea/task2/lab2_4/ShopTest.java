package ru.mirea.lab2_4;

public class ShopTest {
    public static void main(String[] args) {
        Computer c1 = new Computer("i9 13900K", "4090TI", 16, 3000);
        Computer c2 = new Computer("i7 13700K", "4060TI", 16, 2000);
        Computer c3= new Computer("i3 10100F", "1060TI", 8, 500);
        Computer c4 = new Computer("i7 13700K", "4060TI", 8, 1800);
        Shop shop = new Shop();
        shop.addComputer(c1);
        shop.addComputer(c2);
        shop.addComputer(c3);
        shop.addComputer(c4);
        System.out.println(shop.getComputersList());
        System.out.println(shop.search("", "4090TI", 0));
        System.out.println(shop.search("i7 13700K", "", 0));
        System.out.println(shop.search("i7 13700K", "4060TI", 0));
        System.out.println(shop.search("i7 13700K", "4060TI", 8));
    }
}
