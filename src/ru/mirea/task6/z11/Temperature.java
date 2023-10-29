package ru.mirea.task6.z11;

interface Convertable {
    double toC();
    double toK();
    double toF();

}
public class Temperature implements Convertable {
    enum Type {CELSIUS, KELVIN, FAHRENHEIT}

    Type type;
    double value;

    public Temperature(String type, double value) {
        this.type = Type.valueOf(type);
        this.value = value;
    }

    public double toK() {
        if (type == Type.CELSIUS) {
            value-=273.15;
        }
        else if (type == Type.FAHRENHEIT) {
            value = (value - 32) * 5 / 9 + 273.15;
        }
        type = Type.KELVIN;
        return value;
    }

    public double toC() {
        if (type == Type.KELVIN) {
            value += 273.15;
        }
        else if (type == Type.FAHRENHEIT){
            value = (value-32)*5/9;
        }
        type = Type.CELSIUS;
        return value;
    }

    public double toF() {
        if (type == Type.CELSIUS) {
            value = value*9/5 + 32;
        }
        else if (type == Type.KELVIN) {
            value = (double) 9/5*(value-273) + 32;
        }
        type = Type.FAHRENHEIT;
        return value;
    }
}
