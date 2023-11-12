package ru.mirea.task19.task1;

public class WrongINNException extends RuntimeException{
    public WrongINNException(String message, Throwable error) {
        super(message, error);
    }
}
