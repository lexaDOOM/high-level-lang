package edu.penzgtu;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of dodecahedron >> ");
        float length = input.nextFloat();
        System.out.println(dodecahedron_volume(length));
        input.close();
    }

    // Method which calculates dodddecahedron volume
    private static double dodecahedron_volume(double length) {
        return (Math.pow(length, 3) / 4) * (15 + (7 * Math.sqrt(5)));
    }
}
