package ru.mirea.lab3.task_format;

public class Convertor {
    static double doll_rate = 95.125;
    static double eur_rate = 102.816;
    public static double rub_to_usd(double rub) {
        return rub/doll_rate;
    }

    public static double rub_to_eur(double rub) {
        return rub/eur_rate;
    }

    public static double usd_to_rub(double usd) {
        return usd*doll_rate;
    }

    public static double eur_to_rub(double eur) {
        return eur*eur_rate;
    }

    public static double eur_to_usd(double eur) {
        return eur*eur_rate/doll_rate;
    }

    public static double usd_to_eur(double usd) {
        return usd*doll_rate/eur_rate;
    }

}
