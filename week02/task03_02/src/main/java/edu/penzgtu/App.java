package edu.penzgtu;

public class App 
{
    public static void main( String[] args )
    {
        Engine engine1 = new Engine(280);

        Car nissanSkylineGTRR34 = new Car("Nissan Skyline GTR R34", engine1);

        Passenger romanPassenger = new Passenger("Roman");
        Passenger artyomPassenger = new Passenger("Artyom");
        Passenger maximPassenger = new Passenger("Maxim");


        System.out.println(nissanSkylineGTRR34.displayInfo());

        // Adding Passengers
        nissanSkylineGTRR34.addPassenger(maximPassenger);
        nissanSkylineGTRR34.addPassenger(romanPassenger);
        nissanSkylineGTRR34.addPassenger(artyomPassenger); // Extra

        System.out.println(nissanSkylineGTRR34.displayInfo());

        // Replacing Passengers
        nissanSkylineGTRR34.removePassenger(maximPassenger);
        nissanSkylineGTRR34.addPassenger(artyomPassenger);

        System.out.println(nissanSkylineGTRR34.displayInfo());

        // Removing Passengers
        nissanSkylineGTRR34.removePassenger(romanPassenger);
        nissanSkylineGTRR34.removePassenger(artyomPassenger);
        nissanSkylineGTRR34.removePassenger(maximPassenger); // Extra

        System.out.println(nissanSkylineGTRR34.displayInfo());
    }
}
