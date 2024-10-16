package edu.penzgtu;

public class Substring {

    public int substringCount(String text, String searchString) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(searchString, index)) != -1) {
            count++;
            index += searchString.length();
        }
        return count;
    }
}
