package edu.penzgtu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Scanner;

public class App 
{
    public static List<?> getMostFrequentChar(String s) {
        // Находим самый часто встречающийся символ и его количество
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(entry -> Arrays.asList(entry.getKey(), entry.getValue().intValue()))
                .orElse(Arrays.asList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку >> ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println(getMostFrequentChar(input));
    }
}
