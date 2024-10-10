package edu.penzgtu;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the array size >> ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.err.printf("Enter %d element >> ", i + 1);
            array[i] = scanner.nextInt();
        }

        System.out.println("Before: " + Arrays.toString(array));

        MergeSort arrayMergeSort = new MergeSort();
        arrayMergeSort.sort(array);

        System.out.println("After: " + Arrays.toString(array));

        scanner.close();
    }
}
