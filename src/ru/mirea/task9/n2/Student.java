package ru.mirea.task9.n2;

public class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public int compareTo(Student o) {
        int result = Double.compare(this.gpa, o.gpa);
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student (double gpa, String name) {
        this.setGpa(gpa);
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Student[name: " + this.getName() + ", GPA: " + this.getGpa() + "]";
    }
}
