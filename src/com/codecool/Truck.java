package com.codecool;

import java.util.Random;

public class Truck extends Vehicles {
    int chance;
    private String name;
    private int speed;
    protected boolean breakdownTurnsLeft;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public Truck() {
        this.name = generateName("trk ");
        this.speed = setNormalSpeed();
        this.distanceTraveled = 0;
        this.breakdownTurnsLeft = false;
    }

    public String getName() {
        return name;
    }

    public boolean setBrokenTrucks() {
        Random rnd = new Random();
        chance = rnd.nextInt();
        if (chance < 0.5) {
            return true;
        }
        return false;
    }

    public boolean areThereBrokenTrucks() {
        //végig kellene mennie az összes truckon és ha van benne
        if (this.breakdownTurnsLeft)
            return true;
        return false;
    }

    public void moveForAnHour(Weather weather, Truck truck) {
        if (truck.areThereBrokenTrucks()) {
            this.breakdownTurnsLeft = setBrokenTrucks();
            if (this.breakdownTurnsLeft) {
                System.out.println("van van");
                this.speed = 0;
                this.distanceTraveled += this.speed;
            }
            this.speed = setNormalSpeed(true);
            this.distanceTraveled += this.speed;
        } else {
            this.breakdownTurnsLeft = setBrokenTrucks();
            if (this.breakdownTurnsLeft) {
                System.out.println("van");
                this.speed = 0;
                this.distanceTraveled += this.speed;
            }
            this.speed = 100;
            this.distanceTraveled += this.speed;
        }
    }
}
