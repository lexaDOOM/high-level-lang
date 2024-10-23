package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter string count >> ");
        int count = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[count];
        System.out.println();

        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter %d string >> ", i);
            strings[i - 1] = scanner.nextLine();
        }
        scanner.close();

        for (int i = 0; i < count; i++) {
            System.out.println(Repetitions.removeRepeatingCharacters(strings[i]));
        }
    }
}
