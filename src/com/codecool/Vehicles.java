package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Vehicles {
    protected int distanceTraveled;
    protected static final List<Integer> generatedNames = new ArrayList<>();
    public List<String> firstNames = new ArrayList<>(
                Arrays.asList("Red  ", "Blue ", "Purpl", "Yello", "White", "Silvr", "Thund", "Apach",
                        "Negro", "M+m's"));

    //todo: név ellenőrzés, hogy már van-e, és ha van, akkor dobjon újat
    protected String generateName(String type) {
        Random rnd = new Random();
        Object firstName = firstNames.get(rnd.nextInt(firstNames.size())+0);
        Integer lastName = rnd.nextInt(89)+10;
/*        if (!generatedNames.contains(lastName))
            generatedNames.add(lastName);*/
        String name = type + firstName + String.valueOf(lastName);
        return name;
    }

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
