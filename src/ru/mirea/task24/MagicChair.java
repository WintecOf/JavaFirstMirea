package ru.mirea.task24;

public class MagicChair implements Chair{
    boolean isSeated;
    public boolean isSeated() {
        return isSeated;
    }
    public void changeSeat() {
        isSeated = !isSeated;
    }

    public MagicChair() {
        isSeated = false;
    }
    public void doMagic() {

    }
    @Override
    public String toString() {
        return "Magic chair [Seated: " + isSeated +"]";
    }
}
