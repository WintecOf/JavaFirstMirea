package ru.mirea.lab2_4;

import java.util.HashSet;
import java.util.Objects;

public class Shop {
    HashSet<Computer> computers;

    public void addComputer(Computer comp) {
        computers.add(comp);
    }

    public HashSet<Computer> getComputersList() {
        return computers;
    }

    public Shop() {
        this.computers = new HashSet<>();
    }

    public HashSet<Computer> search(String cpu, String gpu, int ram) {
        HashSet<Computer> results = new HashSet<Computer>();
        results = (HashSet)this.computers.clone();
        if (!Objects.equals(cpu, "")) {
            Computer cpu_search = new Computer(cpu, "", 0, 0);
            results.removeIf(comp -> comp.compare(cpu_search));
        }
        if (!Objects.equals(gpu, "")) {
            Computer gpu_search = new Computer("", gpu, 0, 0);
            results.removeIf(comp -> comp.compare(gpu_search));
        }
        if (!Objects.equals(ram, 0)) {
            Computer ram_search = new Computer("", "", ram, 0);
            results.removeIf(comp -> comp.compare(ram_search));
        }
        return results;
    }

    @Override
    public String toString() {
        return Integer.toString(computers.size());
    }
}
