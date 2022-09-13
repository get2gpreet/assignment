package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionOne {

    private static final double pie = 3.14159265358979;

    private static List<Integer> getRadiusList(double nValue) {
        List<Integer> radiusList = new ArrayList<>();
        for (int r = 6; r <= nValue; r += 6) {
            radiusList.add(r);
        }
        return radiusList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a program to calculate the volume, surface area, and circumference of a capsule having radius r ranging from 6 to N in increments of 6 and side length a");
        System.out.print("Enter a value for N: ");
        double nValue = scanner.nextDouble();
        System.out.print("Enter a value for a: ");
        double aValue = scanner.nextDouble();
        List<Integer> radiusList = getRadiusList(nValue);
        if (!radiusList.isEmpty()) {
            System.out.println("Radius \t\t Volume \t\t Surface Area \t\t Circumference");
            System.out.println("---------------------------------------------------------------");
            radiusList.forEach(radius -> System.out.println(radius + "\t\t\t" + calculateVolume(radius, aValue)
                    + "\t\t\t" + calculateSurfaceArea(radius, aValue) + "\t\t\t" + calculateCircumference(radius)));
        }
    }

    private static String calculateVolume(int radius, double sideLength) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        return decimalFormat.format((pie * (radius * radius)) * (((4.0 / 3.0) * radius) + sideLength));
    }

    private static String calculateSurfaceArea(int radius, double sideLength) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        return decimalFormat.format(2 * pie * radius * (2 * radius + sideLength));
    }

    private static String calculateCircumference(int radius) {
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        return decimalFormat.format(2 * pie * radius);
    }
}
