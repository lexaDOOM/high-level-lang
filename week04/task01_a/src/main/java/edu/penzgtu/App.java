package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Что ищем: ");
        String searchString = scanner.nextLine();
        System.out.println();

        System.out.print("Введите количество строк для поиска >> ");
        int stringCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Substring search = new Substring();
        int matchCount = 0;

        for (int i = 1; i <= stringCount; i++) {
            System.out.printf("Введите %d строку >> ", i);
            String line = scanner.nextLine();
            matchCount += search.substringCount(line, searchString);
        }

        scanner.close();

        System.out.println(matchCount);
    }
}
