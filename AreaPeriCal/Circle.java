package com.grindingjava.learning.AreaPeriCal;

public class Circle extends Shape {
    private double radius;

    // FIX 1: The constructor now passes a string to super()
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // FIX 2: The method now returns a double, fulfilling the contract
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // FIX 2: This method also returns a double
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}