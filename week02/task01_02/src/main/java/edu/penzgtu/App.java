package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print( "Enter the inner radius >> " );
        double innerRadius = input.nextDouble();

        Octagon octagon1 = new Octagon(innerRadius);

        System.out.printf( "Octagon area - %f\nOctagon perimeter - %f",
        octagon1.calculateArea(), octagon1.calculatePerimeter() );
        input.close();
    }
}
