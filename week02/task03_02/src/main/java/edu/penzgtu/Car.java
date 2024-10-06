package edu.penzgtu;

public class Car {
    private String model;
    private Engine engine;
    private Passenger passenger1;
    private Passenger passenger2;

    // Constructor with parameters
    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    // Add passenger
    public void addPassenger(Passenger passenger) {
        if (passenger1 == null) {
            passenger1 = passenger;
        } else if (passenger2 == null) {
            passenger2 = passenger;
        } else if ((passenger1 == passenger) || (passenger2 == passenger)) {
            System.out.println("The passenger is already in the car\n");
        }
         else {
            System.out.println("There're no free seats!\n");
        }
    }

    // Remove passenger
    public void removePassenger(Passenger passenger) {
        if (passenger == passenger1) {
            passenger1 = null;
        } else if (passenger == passenger2) {
            passenger2 = null;
        } else {
            System.out.println("There's no one to remove!\n");
        }
    }

    // Display info
    public String displayInfo() {
        return String.format("Car: %s\nEngine power: %d hp\nPassenger 1: %s\n Passenger 2: %s\n",
        getModel(), engine.getPower(), passenger1 == null ? "Empty" : passenger1.getPassengerName(),
        passenger2 == null ? "Empty" : passenger2.getPassengerName());
    }
}
