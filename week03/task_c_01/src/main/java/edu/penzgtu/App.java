package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int day;
        String temperature;
        String precipitation = "";
        boolean wind = false;
        boolean humidity = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели (1 - 7) >> ");
        day = scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("Введены неверные данные!");
            System.exit(0);
        }
        System.out.println();

        System.out.print("Введите температуру >> ");
        int temperatureC = scanner.nextInt();
        System.out.println();
        if (temperatureC < 20) {
            temperature = "cold";
        } else if (temperatureC >= 20 && temperatureC < 30) {
            temperature = "warm";
        } else {
            temperature = "hot";
        }

        System.out.print("""
                Введите тип осадков
                1 - ясно;
                2 - облачно;
                3 - дождь;
                4 - снег;
                5 - град
                """);
        System.out.print("Ввод >> ");
        int precipitationType = scanner.nextInt();
        switch (precipitationType) {
            case 1:
                precipitation = "clear";
                break;
            case 2:
                precipitation = "cloudy";
                break;
            case 3:
                precipitation = "rain";
                break;
            case 4:
                precipitation = "snow";
                break;
            case 5:
                precipitation = "hail";
                break;
            default:
                System.out.println("Введены неверные данные!");
                System.exit(0);
        }

        System.out.print("Есть ли ветер? 1 - Да, 2 - Нет. Ввод >> ");
        int windInt = scanner.nextInt();
        System.out.println();
        switch (windInt) {
            case 1:
                wind = true;
                break;
            case 2:
                wind = false;
                break;
            default:
                System.out.println("Введены неверные данные!");
                System.exit(0);
        }

        System.out.print("Введите влажность воздуха. 1 - Высокая, 2 - Низкая. Ввод >> ");
        int humidityInt = scanner.nextInt();
        System.out.println();
        switch (humidityInt) {
            case 1:
                humidity = true;
                break;
            case 2:
                humidity = false;
                break;
            default:
                System.out.println("Введены неверные данные!");
                System.exit(0);
        }

        scanner.close();

        Badminton badminton = new Badminton(day, temperature, precipitation, wind, humidity);

        System.out.println(badminton.wannaPlayBadminton());
    }
}
