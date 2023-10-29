package ru.mirea.task4.z4;

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;

    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer[\n" + processor.toString() + "\n" + memory.toString() + "\n" + monitor.toString() + "\n" + "]";
    }
}
