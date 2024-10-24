package edu.penzgtu;

public class Converter {

    // Convert to String
    public static String toString(String input) {
        return input;
    }

    // Convert to int
    public static int toInt(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }

    // Conveert to byte
    public static byte toByte(String input) throws NumberFormatException {
        return Byte.parseByte(input);
    }

    // Convert to short
    public static short toShort(String input) throws NumberFormatException {
        return Short.parseShort(input);
    }

    // Convert to float
    public static float toFloat(String input) throws NumberFormatException {
        return Float.parseFloat(input);
    }

    // Convert to double
    public static double toDouble(String input) throws NumberFormatException {
        return Double.parseDouble(input);
    }

    public static boolean toBoolean(String input) throws IllegalArgumentException {
        return Boolean.parseBoolean(input);
    }
}
