package com.grindingjava.learning.AreaPeriCal;

public class Rectangle extends Shape {
    private double length;
    private double width; // Renamed for clarity, "width" is more standard than "breadth"

    // FIX 1 & 2: Constructor now correctly calls super() and initializes fields.
    public Rectangle(double length, double width) {
        super("Rectangle"); // Pass the name as a String
        this.length = length;
        this.width = width;
    }

    // FIX 3: Method now correctly returns a double and does not print.
    @Override
    public double getArea() {
        return length * width;
    }

    // FIX 3: Method now correctly returns a double and does not print.
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}