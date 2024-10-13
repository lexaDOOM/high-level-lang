package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit >> ");
        int limit = scanner.nextInt();
        scanner.close();
        
        // Imcorrect limit check
        if (limit < 2) {
            System.out.println("Incorrect limit!");
            System.exit(0);
        }

        Erathosphene primeNumbers = new Erathosphene(limit);
        primeNumbers.findPrimeNumbers();
    }
}
