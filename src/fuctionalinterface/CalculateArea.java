package fuctionalinterface;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.DoubleStream;

public class CalculateArea {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        int radius = new Scanner(System.in).nextInt();
        Function<Circle, Double> findRadius = Circle -> Circle.radius * Circle.radius * 3.14;
        System.out.println(findRadius.apply(new Circle(radius)));
    }
}


class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
}
