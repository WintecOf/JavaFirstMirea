package ru.mirea.task10;

import java.util.*;


public class SortingStudentsByGPA {
    Comparator<Student> scomp = new StudentGPAComparator().thenComparing(new StudentYearComparator().thenComparing(new StudentNameComparartor()));
    TreeSet<Student> iDNumber = new TreeSet<Student>(scomp);

    public void setArray(Student ... s) {
        iDNumber.clear();
        Collections.addAll(iDNumber, s);
    }
    public void outArray() {
        for (Student element: iDNumber) {
            System.out.println(element);
        }
    }

    public SortingStudentsByGPA(Student ... s) {
        Collections.addAll(iDNumber, s);
    }

    public SortingStudentsByGPA(SortingStudentsByGPA ... groups) {
        for (SortingStudentsByGPA group: groups) {
            iDNumber.addAll(group.iDNumber);
        }
    }

    public void addArray(Student ... s) {
        Collections.addAll(iDNumber, s);
    }

    public void merge(SortingStudentsByGPA other) {
        this.iDNumber.addAll(other.iDNumber);
    }
}
