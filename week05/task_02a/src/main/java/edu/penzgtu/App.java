package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something to convert >> ");
        String message = scanner.nextLine();

        System.out.println("Enter a type >> ");
        String targetType = scanner.nextLine().toLowerCase();

        scanner.close();

        try {
            switch (targetType) {
                case "int":
                    int intValue = Converter.toInt(message);
                    System.out.println("(int) result: " + intValue);
                    break;
                case "double":
                    double doubleValue = Converter.toDouble(message);
                    System.out.println("(double) result: " + doubleValue);
                    break;
                case "boolean":
                    boolean boolValue = Converter.toBoolean(message);
                    System.out.println("(boolean) result: " + boolValue);
                    break;
                case "string":
                    String stringValue = Converter.toString(message);
                    System.out.println("(string) result: " + stringValue);
                    break;
                case "byte":
                    byte byteValue = Converter.toByte(message);
                    System.out.println("(byte) result: " + byteValue);
                    break;
                case "short":
                    short shortValue = Converter.toShort(message);
                    System.out.println("(short) result: " + shortValue);
                    break;
                case "float":
                    float floatValue = Converter.toFloat(message);
                    System.out.println("(byte) result: " + floatValue);
                    break;
                default:
                    System.out.println("Unknown type!");
                    break;
            }
        } catch (NumberFormatException error) {
            System.out.println(message + "cannot be parsed to " + targetType);
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
