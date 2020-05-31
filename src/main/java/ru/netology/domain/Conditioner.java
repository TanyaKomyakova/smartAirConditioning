package ru.netology.domain;

public class Conditioner {
    private String name = "Hyundai";
    private int maxTemperature = 30;
    private int minTemperature = 15;
    private int currentTemperature;
    private boolean on;

    public void increaseCurrentTemperature(){
        if (currentTemperature == maxTemperature){
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature(){
        if (currentTemperature == minTemperature){
            return;
        }
        currentTemperature--;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
