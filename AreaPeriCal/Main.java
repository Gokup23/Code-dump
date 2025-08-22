package com.grindingjava.learning.AreaPeriCal;

public class Main {
    public static void main(String[] args) {
        // Your setup is perfect.
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);

        System.out.println("--- Calculating Shape Details ---");

        // Loop through each shape in the array
        for (Shape shape : shapes) {
            System.out.printf(
                    "Shape: %s, Area: %.2f, Perimeter: %.2f%n",
                    shape.getName(),
                    shape.getArea(),
                    shape.getPerimeter()
            );
        }
    }
}