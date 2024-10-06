package edu.penzgtu;

public class Passenger {
    private String name;


    // Constructor with parameters
    public Passenger(String name) {
        this.name = name;
    }

    public Passenger() {
        this.name = "free";
    }

    public String getPassengerName() {
        return name;
    }

    public void setPassengerName(String name) {
        this.name = name;
    }
}
