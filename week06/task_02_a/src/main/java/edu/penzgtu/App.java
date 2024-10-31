package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LatinEnglishDict dictionary = new LatinEnglishDict();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            dictionary.addEntry(line);
        }

        System.out.println(dictionary.getLatinWordCount());
        System.out.println(dictionary.getLatinEnglishDictionary());

        scanner.close();
    }
}
