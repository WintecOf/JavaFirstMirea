package ru.mirea.task4.z4;

import static ru.mirea.task4.z4.Processor.Brand.INTEL;

public class Tester {
    public static void main(String[] args) {
        Computer c1 = new Computer(new Processor("INTEL", "i3 12100F", 3.3, 4.8, 4, 8), new Memory("AMD", "DIMM", "DDR4", 3200, 16), new Monitor("MSI", 27, 2560, 1440, 144));
        System.out.println(c1);
    }
}