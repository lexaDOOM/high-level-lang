package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length >> ");
        int length = scanner.nextInt();

        int[] array;
        array = new int[length];

        for (int i = 1; i <= length; i++) {
            System.out.println();
            System.err.printf("Enter %d element >>", i);
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }
}
