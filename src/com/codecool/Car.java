package com.codecool;
/*Car
        normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
        name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
        distanceTraveled // holds the current distance traveled.
        moveForAnHour(Race race) // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
// If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.*/

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String name;
    private static final List<String> generatedNames = new ArrayList<>();
    private int normalSpeed;
    private int distanceTraveled; // ezt folyamatosan updatelni kell car-onként

    public Car(String name, int normalSpeed, int distanceTraveled) {
        this.name = ;
        this.normalSpeed = ;
        this.distanceTraveled = ;
    }

    public static List<Car> createNewCar() {
        List<Car> result = new ArrayList<>();
        result.add(new Car(, true));
        return result;
    }

    public String getName() {
        generatedNames.add(name);
        return name;
    }

    private String generateName() {
        return "test";
    }

    public int setNormalSpeed(Car car) {
        //generateSpeed();
        return normalSpeed;
    }

    //ez miért itt lakik? miért nem main függvény?
    public void moveForAnHour(Race race){

    }

}
