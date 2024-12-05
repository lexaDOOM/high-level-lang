package edu.penzgtu;

public class ClassicFibonacci {
    public static long classicFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return classicFibonacci(n - 1) + classicFibonacci(n - 2);
    }
}
