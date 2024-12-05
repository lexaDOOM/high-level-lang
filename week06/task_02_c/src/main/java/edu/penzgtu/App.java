package edu.penzgtu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, Long> classicTime = new HashMap<>();
        Map<Integer, Long> cachedTime = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n >> ");
        int n = scanner.nextInt();
        scanner.close();

        // Переменные для подсчёта затраченного времени
        long startTime;
        long endTime;
        long totalTime;

        for (int i = 1; i <= n; i++) {
            // Классическая реализация
            startTime = System.currentTimeMillis();
            System.out.println("F_classic(" + i + ") = " + ClassicFibonacci.classicFibonacci(i));
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            classicTime.put(i, totalTime);
            System.out.println("Затрачено времени (мс): " + totalTime + "\n");

            // Оптимизированная реализация
            startTime = System.currentTimeMillis();
            System.out.println("F_cached(" + i + ") = " + OptimizedFibonacci.cachedFibonacci(i));
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            cachedTime.put(i, totalTime);
            System.out.println("Затрачено времени (мс): " + totalTime + "\n");
        }

        // Запись данных в файл для дальнейшей обработки
        WriteFiles.writeTimesToFile("classic.txt", classicTime);
        WriteFiles.writeTimesToFile("cached.txt", cachedTime);
    }
}
