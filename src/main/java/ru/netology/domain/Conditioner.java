package ru.netology.domain;

public class Conditioner {
    private String name = "Hyundai";
    private int maxTemperature = 30;
    private int minTemperature = 15;
    private int currentTemperature;
    private boolean on;

    public void increaseCurrentTemperature(){
        if (currentTemperature >= maxTemperature){
            currentTemperature = maxTemperature;
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature(){
        if (currentTemperature <= minTemperature){
            currentTemperature = maxTemperature;
            return;
        }
        currentTemperature--;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
