package ru.mirea.task10;

import java.util.Comparator;

public class StudentNameComparartor implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        String name_a = a.getFname() + a.getLname();
        String name_b = b.getFname() + b.getLname();
        return name_a.compareTo(name_b);
    }
}
