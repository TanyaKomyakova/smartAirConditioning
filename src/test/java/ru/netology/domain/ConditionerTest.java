package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void TestIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.getName();
        conditioner.getMaxTemperature();
        conditioner.getMinTemperature();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.increaseCurrentTemperature();
        int expected = 16;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected,actual);

    }

    @Test
    public void TestdecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setOn(true);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        int expected = 14;
        int actual = conditioner.getCurrentTemperature();
        assertEquals(expected,actual);
    }
}