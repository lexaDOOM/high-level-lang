package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size >> ");
        int size = scanner.nextInt();
        double[] arr = new double[size];

        if (size < 2) {
            System.out.println("Wrong array size!");
            System.exit(0);
        }

        for (int i = 1; i <= size; i++) {
            System.err.printf("Enter the %d element >> ", i);
            arr[i - 1] = scanner.nextDouble();
        }

        scanner.close();

        Median median = new Median(arr);

        System.out.println(median.calculateMedian());
    }
}
