package ru.mirea.task17.list_2;

import ru.mirea.task18.TaskNumber;

public enum Rarity {
    COMMON("Common"),
    UNCOMMON("Uncommon"),
    RARE("Rare"),
    VERY_RARE("Very rare"),
    SPECIAL("Special"),
    EPIC("Epic"),
    LEGENDARY("Legendary"),
    NOT_FOUND("Not found");

    private final String value;
    Rarity(final String value) {
        this.value = value;
    }
    public static Rarity fromValue(String value) {
        for (final Rarity number : values()) {
            if (number.value.equalsIgnoreCase(value)) {
                return number;
            }
        }
        return NOT_FOUND;
    }
}
