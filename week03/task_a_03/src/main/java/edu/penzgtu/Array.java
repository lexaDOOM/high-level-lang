package edu.penzgtu;

import java.lang.Math;

public class Array {
    private int maxCount;
    private int arrayLength;
    private int[] array;
    private int maxValue;

    // Constructor with parameters
    public Array (int[] array) {
        this.array = array;
        this.arrayLength = array.length;
    }

    public String maxCountInArray() {

        // Finding max value in an array
        maxValue = array[0];
        for (int i = 1; i < arrayLength; i++) {
            maxValue = Math.max(maxValue, array[i]);
        }

        // Finding count of max elements in an array
        maxCount = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == maxValue) {
                maxCount += 1;
            }
        }

        // Results
        return String.format("Max value: %d\nMax value count: %d", maxValue, maxCount);
    }
}
