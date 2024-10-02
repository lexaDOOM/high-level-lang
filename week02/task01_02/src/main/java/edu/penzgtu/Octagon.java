package edu.penzgtu;

public class Octagon {
    private double innerRadius;

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double calculateArea() {
        return 8 * Math.pow(innerRadius, 2) * (Math.sqrt(2) - 1);
    }

    public double calculatePerimeter() {
        return (16 * innerRadius) / (1 + Math.sqrt(2));
    }

    public Octagon(double innerRadius) {
        this.innerRadius = innerRadius;
    }
}
