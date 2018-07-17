package com.codecool;

import java.util.Random;

public class Vehicles {
    public int setNormalSpeed() {
        int min = 80;
        int max = 30;
        Random rnd = new Random();
        int speed = rnd.nextInt(max)+min;
        return speed;
    }

    public int setNormalSpeed(boolean areThereBrokenTrucks) {
        if (!areThereBrokenTrucks) {
            setNormalSpeed();
        }
        int speed = 75;
        return speed;
    }

}
