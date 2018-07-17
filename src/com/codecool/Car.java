package com.codecool;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vehicles {
    private String name;
    private static final List<String> generatedNames = new ArrayList<>();
    private int normalSpeed;

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    private int distanceTraveled; // ezt folyamatosan updatelni kell car-onként


    public static List initList() {
        List<String> namesPool = new ArrayList<>(
            Arrays.asList("Red  ", "Blue ", "Purpl", "Yello", "White"));
        return namesPool;
    }


    public int getNormalSpeed() {
        return normalSpeed;
    }

    public Car() {
        this.name = generateName();
        this.normalSpeed = setNormalSpeed();
        this.distanceTraveled = 0;
    }

    public static List<Car> createNewCar() {

        List<Car> result = new ArrayList<>();
        result.add(new Car());
        return result;
    }

    public String getName() {
        return name;
    }

    private String generateName() {
        Random rnd = new Random();
        Object firstName =  initList().get(rnd.nextInt( initList().size())+0);
        int lastName = rnd.nextInt(50)+01;
        String name = "Car " + firstName + String.valueOf(lastName);
        generatedNames.add(name);
        return name;
    }

    //ez miért itt lakik? miért nem main függvény?
    public void moveForAnHour(Weather weather, Truck truck){
        //a létrejött instance adatokat a megfelelő objekthez hozzáadja egyszer
        if (weather.isRaining() && truck.areThereBrokenTrucks()) {
            int rain = 25;
            this.normalSpeed = setNormalSpeed(true) - rain;
            System.out.println("rain + trucks " + this.normalSpeed);
            this.distanceTraveled += this.normalSpeed;
        } else if (weather.isRaining()) {
            int rain = 25;
            this.normalSpeed = setNormalSpeed();
            System.out.println("rain only " + this.normalSpeed);
            this.normalSpeed = this.normalSpeed - rain;
            this.distanceTraveled += this.normalSpeed;
        } else if (truck.areThereBrokenTrucks()) {
            this.normalSpeed = setNormalSpeed(true);
            System.out.println("trucks " + this.normalSpeed);
            this.distanceTraveled += this.normalSpeed;
        } else {
            this.normalSpeed = setNormalSpeed();
            System.out.println("egyiksem " + this.normalSpeed);
            this.distanceTraveled += this.normalSpeed;
        }

    }


}
