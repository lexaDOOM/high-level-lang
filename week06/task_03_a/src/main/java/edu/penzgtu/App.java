package edu.penzgtu;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces >> :");
        String input = scanner.nextLine();
        scanner.close();
        
        // Преобразуем строку ввода в массив целых чисел
        String[] inputStrings = input.split(" ");
        Integer[] inputArray = new Integer[inputStrings.length];
        for (int i = 0; i < inputStrings.length; i++) {
            inputArray[i] = Integer.parseInt(inputStrings[i]);
        }

        // Вызов метода для удаления дубликатов
        Integer[] resultArray = DuplicateRemover.removeDuplicates(inputArray);

        System.out.println("Array without dublicates: " + Arrays.toString(resultArray));
    }
}
