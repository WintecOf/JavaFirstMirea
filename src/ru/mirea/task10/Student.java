package ru.mirea.task10;

public class Student{
    private String fname;
    private String lname;
    private String speciality;
    private int year;
    private String group;
    private double gpa;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String fname, String lname, String speciality, int year, String group, double gpa) {
        this.fname = fname;
        this.lname = lname;
        this.speciality = speciality;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Студент:\n" +
                "Имя: " + this.getFname() + ", Фамилия: " + this.getLname() + "\n" +
                "Специальность: " + this.getSpeciality() + "\n" +
                "Курс: " + this.getYear() + ", Группа: " + this.getGroup() + "\n" +
                "Средняя оценка: " + this.getGpa() + "\n";
    }
}
