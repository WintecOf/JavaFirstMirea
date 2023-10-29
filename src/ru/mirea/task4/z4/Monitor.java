package ru.mirea.task4.z4;

public class Monitor {
    public enum Brand {
        Dell,
        AOC,
        ASUS,
        Apple,
        MSI,
        LG,
        Xiaomi
    }

    Brand brand;
    double size;
    int width;
    int height;
    int refresh_rate;
    double aspect_ratio;
    int resolution;

    public Monitor(String brand, double size, int width, int height, int refresh_rate) {
        this.brand = Brand.valueOf(brand);
        this.size = size;
        this.width = width;
        this.height = height;
        this.refresh_rate = refresh_rate;
        this.resolution= width*height;
        this.aspect_ratio=(double) width/height;
    }

    @Override
    public String toString() {
        return "Monitor[Brand: " + this.brand +
                ", Size: " + this.size + " inches, Resolution: " +
                this.width + "x" + this.height + ", Refresh rate: " +
                this.refresh_rate + " Hz]";
    }
}
