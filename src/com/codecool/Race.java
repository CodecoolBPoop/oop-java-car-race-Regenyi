package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Race {
    Car[] carArr = new Car[10];
    public Weather weather = new Weather();
    public Truck truckB = new Truck();

    public void createVehicles() {
        for (int i = 0; i < 10; i++) {
            carArr[i] = new Car();
        }
    }

    public Race() {
        createVehicles();
        simulateRace();
    }

    private void simulateRace() {
        for (int i = 0; i < 5; i++) {
            weather.setRaining();
            truckB.setBrokenTrucks();
            System.out.println(weather.isRaining() + " " + truckB.areThereBrokenTrucks());
            for (int j = 0; j < 10; j++) {
                carArr[j].moveForAnHour(weather, truckB);
            }
        }
        printRaceResults();
    }

    private void printRaceResults() {
        for (int i = 0; i < 10; i++) {
            System.out.println(carArr[i].getName() + " " + carArr[i].getDistanceTraveled()+"km");
        }
    }

    public static void main(String[] args) {
        Race race = new Race();
    }
}
