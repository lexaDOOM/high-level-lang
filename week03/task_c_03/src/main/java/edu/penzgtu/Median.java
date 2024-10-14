package edu.penzgtu;

import java.util.Arrays;

public class Median {

    private double arr[];

    public Median(double arr[]) {
        this.arr = arr;
    }

    public double calculateMedian() {
        Arrays.sort(arr);

        int length = arr.length;

        // If length is odd
        if (length % 2 != 0) {
            return arr[length / 2];
        // If length is even
        } else {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        }
    }
}
