package edu.penzgtu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       Scanner scanner = new Scanner(System.in);
        ProfitCalc calculator = new ProfitCalc();
        List<Integer> prices = new ArrayList<>();

        System.out.println("Enter stock prices divided by comma >> ");
        String[] input = scanner.nextLine().split(",");

        try {
            for (String price : input) {
                prices.add(Integer.parseInt(price));
            }

            int maxProfit = calculator.maxProfit(prices);
            System.out.println("Max profit: " + maxProfit);

        } catch (NumberFormatException error) {
            System.out.println("Error! Enter integer numbers!");
        } finally {
            scanner.close();
        }

    }
}
