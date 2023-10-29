package ru.mirea.task11.n3;

public class Tester {
    public static void main(String[] args) {
        int[] bday = {2005, 3, 15};
        Student s = new Student("Кирилл", "Кучеренко", "ИВТ", 2, "КВБО-04-22", 4.7, bday);
        System.out.println(s);
        System.out.println(s.toString("short"));
        System.out.println(s.toString("long"));
        System.out.println(s.toString("mid"));
    }
}
