package com.codecool;

import java.util.Random;

public class Truck {
    int chance;

    public void setBrokenTrucks() {
        Random rnd = new Random();
        chance = rnd.nextInt();
    }

    public boolean areThereBrokenTrucks() {
        if (chance < 0.5) {
            return true;
        }
        return false;
    }
}
