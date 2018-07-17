package com.codecool;

import java.util.Random;

public class Motor extends Vehicles {
    private String name;
    private int speed;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public Motor() {
        this.name = generateName("mot ");
        this.speed = setNormalSpeed();
        this.distanceTraveled = 0;
    }

    public String getName() {
        return name;
    }

    protected int rainSpeedModifier() {
        int min = 5;
        int max = 45;
        Random rnd = new Random();
        int speed = rnd.nextInt(max)+min;
        return speed;
    }

    public void moveForAnHour(Weather weather, Truck truck) {
        if (weather.isRaining() && truck.areThereBrokenTrucks()) {
            this.speed = setNormalSpeed(true) - rainSpeedModifier();
            this.distanceTraveled += this.speed;
        } else if (weather.isRaining()) {
            this.speed = this.speed - rainSpeedModifier();
            this.distanceTraveled += this.speed;
        } else if (truck.areThereBrokenTrucks()) {
            this.speed = setNormalSpeed(true);
            this.distanceTraveled += this.speed;
        } else {
            this.speed = 100;
            this.distanceTraveled += this.speed;
        }
    }
}
