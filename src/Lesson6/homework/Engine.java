package Lesson6.homework;

public class Engine {
    private String name;
    private boolean isStarted;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        this.isStarted = true;
    }

    public void turnOff() {
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }
}