package ru.mirea.task10;

import java.util.Comparator;

public class StudentYearComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getYear() > b.getYear()) {
            return 1;
        }
        else if (a.getYear() < b.getYear()) {
            return -1;
        }
        return 0;
    }
}
