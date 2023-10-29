package ru.mirea.task4.z4;

public class Memory {
    public enum Brand {
        INTEL,
        AMD,
        Crucial,
        Cougar,
        ADATA,
        HyperX
    }

    public enum Socket {
        DIMM,
        SODIMM
    }
    public enum Type {
        DDR1,
        DDR2,
        DDR3,
        DDR4,
        DDR5
    }
    Brand brand;
    Socket socket;
    Type type;
    int speed;
    int size;

    public Memory(String brand, String socket, String type, int speed, int size) {
        this.brand = Brand.valueOf(brand);
        this.socket = Socket.valueOf(socket);
        this.type = Type.valueOf(type);
        this.speed = speed;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory[Brand: " + this.brand +
                ", Socket: " + this.socket + ", Type: " +
                this.type + ", Speed: " + this.speed + " MHz, Size: " +
                this.size + " GB]";
    }
}
