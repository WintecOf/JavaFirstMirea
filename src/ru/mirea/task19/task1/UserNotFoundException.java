package ru.mirea.task19.task1;

import ru.mirea.task18.Exception2;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message, Throwable error) {
        super(message, error);
    }
}
