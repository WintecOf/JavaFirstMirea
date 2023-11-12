package ru.mirea.task17.list_2;

public enum Color {
    BLUE("Blue"),
    GREEN("Green"),
    RED("Red"),
    BLACK("Black"),
    WHITE("White"),
    PURPLE("Purple"),
    NOT_FOUND("Not found");

    private final String value;
    Color(final String value) {
        this.value = value;
    }
    public static Color fromValue(String value) {
        for (final Color number : values()) {
            if (number.value.equalsIgnoreCase(value)) {
                return number;
            }
        }
        return NOT_FOUND;
    }
}
