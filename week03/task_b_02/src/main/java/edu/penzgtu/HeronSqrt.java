package edu.penzgtu;

public class HeronSqrt {
    private double number;

    public HeronSqrt(double number) {
        this.number = number;
    }

    public double sqrtCalculate() {

        if (number == 0) {
            return 0;
        }

        double approx = number / 2.0;
        double calcError = 0.000001;
        double result;

        while (true) {
            result = (approx + number / approx) / 2;
            if (Math.abs(result - approx) < calcError) {
                break;
            }
            approx = result;
        }
        return result;
    }
}
