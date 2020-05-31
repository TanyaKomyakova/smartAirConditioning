package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 21;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected,actual);

    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int expected = 15;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected,actual);
    }
}