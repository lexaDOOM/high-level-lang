package edu.penzgtu;

public class Repetitions {
    public static String removeRepeatingCharacters(String input) {
        return input.replaceAll("(.)\\1{2,}", "$1");
    }
}
