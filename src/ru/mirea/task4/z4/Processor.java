package ru.mirea.task4.z4;

public class Processor {
    public enum Brand {
        INTEL,
        AMD
    }
    Brand brand;
    String model;
    double base_frequency;
    double turbo_frequency;
    int cores;
    int threads;

    public Processor(String brand, String model, double base_frequency, double turbo_frequency, int cores, int threads) {
        this.brand = Brand.valueOf(brand);
        this.model = model;
        this.base_frequency = base_frequency;
        this.turbo_frequency = turbo_frequency;
        this.cores = cores;
        this.threads = threads;
    }

    @Override
    public String toString() {
        return "Processor[Brand: " + this.brand + ", Model: " +
                this.model + ", Frequency: " + this.base_frequency + " / " +
                this.turbo_frequency + " GHz, Cores/Threads: " + this.cores + " / " +
                this.threads + "]";
    }
}
