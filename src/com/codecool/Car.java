package com.codecool;

public class Car extends Vehicles {
    private String name;
    private int normalSpeed;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public Car() {
        this.name = generateName("car ");
        this.normalSpeed = setNormalSpeed();
        this.distanceTraveled = 0;
    }

    public String getName() {
        return name;
    }

    //ez miért itt lakik? miért nem main függvény?
    public void moveForAnHour(Weather weather, Truck truck){
        //a létrejött instance adatokat a megfelelő objekthez hozzáadja egyszer
        if (truck.areThereBrokenTrucks()) {
            this.normalSpeed = setNormalSpeed(true);
            this.distanceTraveled += this.normalSpeed;
        } else {
            this.normalSpeed = setNormalSpeed();
            this.distanceTraveled += this.normalSpeed;
        }

    }
}
