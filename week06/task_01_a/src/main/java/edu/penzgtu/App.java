package edu.penzgtu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        System.out.println("Enter numbers separated by spaces >> ");
        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            input.add(Integer.parseInt(number));
        }
        List<List<Integer>> permutations = Permutations.perms(input);
        System.out.println("All possible permutations:");
        System.out.println(permutations);

        scanner.close();
    }
}
