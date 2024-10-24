package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sensors data >> ");
        String input = scanner.nextLine();

        if (input.length() > 512) {
            input = input.substring(0, 512);
        }

        String[] sensorsData = input.split("@");

        Sensors processor = new Sensors(input.length());

        processor.sensorDataProc(sensorsData);
        
        double[] averageTemps = processor.calculateAverageTemps();

        System.out.print("Sort by: 1 - IDs, 2 - Temperature >> ");
        int sortChoice = scanner.nextInt();
        scanner.close();
        
        if (sortChoice == 1) {
            processor.sortById(averageTemps);
        } else if (sortChoice == 2) {
            processor.sortByTemp(averageTemps);
        } else {
            System.out.println("Wrong choice!");
            System.exit(0);
        }

        processor.printResults(averageTemps);
    }
}
