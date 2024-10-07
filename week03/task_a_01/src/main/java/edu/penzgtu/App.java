package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        // Initializing Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст >> ");
        int age = scanner.nextInt();

        AgeForm ageForm = new AgeForm(age);
        System.out.println(ageForm.getAgeCorrectForm());
    }
}
