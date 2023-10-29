package ru.mirea.task13.n2;

import java.util.Objects;

public class Person {
    String first_name;
    String last_name;
    String father_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public Person(String first_name, String last_name, String father_name) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.father_name = father_name;
    }

    public String get_fio() {
        String fst, l, f;
        if (!Objects.equals(first_name, "")) {
            fst = first_name.charAt(0) + ".";
        }
        else {
            fst = "";
        }

        if (!Objects.equals(last_name, "")) {
            l = last_name + " ";
        }
        else {
            l = "";
        }

        if (!Objects.equals(father_name, "")) {
            f = father_name.charAt(0) + ".";
        }
        else {
            f = "";
        }
        return String.format("%s%s%s", l, fst, f);
    }
}
