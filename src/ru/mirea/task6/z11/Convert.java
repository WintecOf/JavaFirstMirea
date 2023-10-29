package ru.mirea.task6.z11;



public class Convert {
    public static void main(String[] args) {
        Convertable temp = new Temperature("CELSIUS", 25);
        System.out.println(temp.toF());
        System.out.println(temp.toK());
    }
}
