package ru.mirea.task17.list_2;

public enum Size {
    SMALL("Common"),
    MEDIUM("Medium"),
    BIG("Big"),
    HUGE("Huge"),
    GIGANTIC("Gigantic"),
    NOT_FOUND("Not found");

    private final String value;
    Size(final String value) {
        this.value = value;
    }
    public static Size fromValue(String value) {
        for (final Size number : values()) {
            if (number.value.equalsIgnoreCase(value)) {
                return number;
            }
        }
        return NOT_FOUND;
    }
}
