package com.codecool;


public class Race {
    Car[] carArr = new Car[10];
    Motor[] motorArr = new Motor[10];
    Truck[] truckArr = new Truck[10];
    public Weather weather = new Weather();
    public Truck truck = new Truck();

    public void createVehicles() {
        for (int i = 0; i < 10; i++) {
            carArr[i] = new Car();
            motorArr[i] = new Motor();
            truckArr[i] = new Truck();
        }
    }

    private void simulateRace() {
        int laps = 50;
        for (int i = 0; i < laps; i++) {
            weather.setRaining();
            truck.areThereBrokenTrucks();
            for (int j = 0; j < carArr.length; j++) {
                carArr[j].moveForAnHour(weather, truck);
                motorArr[j].moveForAnHour(weather, truck);
                truckArr[j].moveForAnHour(weather, truck);
            }
        }
    }

    private void printRaceResults() { //kérdés: hogy sortolod? ha Arrays.aslist-ezed a carArr-t hogy alakitod nem hasobjecté)
        int max = carArr[1].getDistanceTraveled();
        int index = 0;
        for (int i = 0; i < carArr.length; i++) {
            System.out.println(carArr[i].getName() + " " + carArr[i].getDistanceTraveled()+"km");
 /*               if (carArr[i].getDistanceTraveled()>max){
                    max = carArr[i].getDistanceTraveled();
                    index = i;
                }*/
            System.out.println(motorArr[i].getName() + " " + motorArr[i].getDistanceTraveled()+"km");
            System.out.println(truckArr[i].getName() + " " + truckArr[i].getDistanceTraveled()+"km");

        }
        System.out.println("winner is " + carArr[index].getName() + " with " + carArr[index].getDistanceTraveled()+"km");
    }

    public Race() {
        createVehicles();
        simulateRace();
        printRaceResults();
    }

    public static void main(String[] args) {
        Race race = new Race();
    }
}
