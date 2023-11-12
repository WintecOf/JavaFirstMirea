package ru.mirea.task18;

import ru.mirea.task1.Lab1.Task;

public enum TaskNumber {
    FIRST("1"),
    SECOND("2"),
    THIRD("3"),
    FOURTH("4"),
    FIFTH("5"),
    SIXTH("6"),
    SEVENTH("7"),
    EIGHTH("8"),
    NOT_FOUND("Not found"),
    END("0");

    private final String value;

    TaskNumber(final String value) {
        this.value = value;
    }

    public static TaskNumber fromValue(String value) {
        for (final TaskNumber number : values()) {
            if (number.value.equalsIgnoreCase(value)) {
                return number;
            }
        }
        return NOT_FOUND;
    }
}
