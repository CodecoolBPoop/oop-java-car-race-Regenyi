package com.codecool;

import java.util.Random;

public class Weather {
    private int chance;

    public void setRaining() {
        Random rnd = new Random();
        chance = rnd.nextInt();
    }

    public boolean isRaining() {
        if (chance < 0.3) {
            return true;
        }
        return false;
    }
}
