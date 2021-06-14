package Lesson7.exceptions;

public class EmptyFuelTankException extends RuntimeException {
    public EmptyFuelTankException(String message) {
        super(message);
    }
}
