package ru.mirea.task11.n3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.*;
public class Student{
    private String fname;
    private String lname;
    private String speciality;
    private int year;
    private String group;
    private double gpa;
    Calendar bd;

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

    public Student(String fname, String lname, String speciality, int year, String group, double gpa, int[] date) {
        this.fname = fname;
        this.lname = lname;
        this.speciality = speciality;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
        this.bd = new GregorianCalendar(date[0], date[1]-1, date[2]);
    }

    public Calendar getBd() {
        return bd;
    }

    public void setBd(Calendar bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Студент:\n" +
                "Имя: " + this.getFname() + ", Фамилия: " + this.getLname() + "\n" +
                "Специальность: " + this.getSpeciality() + "\n" +
                "Курс: " + this.getYear() + ", Группа: " + this.getGroup() + "\n" +
                "Средняя оценка: " + this.getGpa() + "\n" +
                "Дата рождения: " + this.getBd().getTime() + "\n";
    }

    public String toString(String format) {
        DateFormat sh = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        DateFormat md = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        DateFormat lg = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        String ret_str = "Студент:\n" +
                "Имя: " + this.getFname() + ", Фамилия: " + this.getLname() + "\n" +
                "Специальность: " + this.getSpeciality() + "\n" +
                "Курс: " + this.getYear() + ", Группа: " + this.getGroup() + "\n" +
                "Средняя оценка: " + this.getGpa() + "\n";
        if (Objects.equals(format, "short")) {
            ret_str += "Дата рождения: " + sh.format(this.getBd().getTime()) + "\n";
        }
        else if (Objects.equals(format, "mid")) {
            ret_str += "Дата рождения: " + md.format(this.getBd().getTime()) + "\n";
        }
        else if (Objects.equals(format, "long")) {
            ret_str += "Дата рождения: " + lg.format(this.getBd().getTime()) + "\n";
        }
        else {
            ret_str += "Дата рождения: " + this.getBd().getTime() + "\n";
        }
        return ret_str;
    }
}