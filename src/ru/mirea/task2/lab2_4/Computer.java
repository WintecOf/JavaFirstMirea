package ru.mirea.lab2_4;

import java.util.Objects;

public class Computer {
    String cpu = "";
    String gpu = "";
    int ram = 0;
    int price = 0;

    public Computer(String cpu, String gpu, int ram, int price) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.price = price;
    }

    public boolean compare(Computer comp) {
        return !Objects.equals(this.cpu, comp.cpu) && !Objects.equals(this.gpu, comp.gpu) && !Objects.equals(this.ram, comp.ram);
    }

    @Override
    public String toString() {
        return "Computer {cpu = " + cpu + ", gpu = " + gpu + ", ram = " + ram + ", price = " + price + "}";
    }
}
