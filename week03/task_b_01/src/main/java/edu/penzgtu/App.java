package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number >> ");
        int month = scanner.nextInt();
        System.err.println();

        System.out.print("Enter year >> ");
        int year = scanner.nextInt();
        System.err.println();

        scanner.close();

        DaysInMonth newMonth = new DaysInMonth(month, year);

        System.out.println(newMonth.getNumberOfdays());
    }
}
