package ru.mirea.task10;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getGpa() > b.getGpa()) {
            return 1;
        }
        else if (a.getGpa() < b.getGpa()) {
            return -1;
        }
        return 0;
    }
}
