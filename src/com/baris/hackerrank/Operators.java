package com.baris.hackerrank;

import java.util.Scanner;

/**
 * Created by barisilhan on 6/22/2018.
 */
public class Operators {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mealCost = scanner.nextDouble();
        int tipPercent = scanner.nextInt();
        int taxPercent = scanner.nextInt();

        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        int totalCost = (int) Math.round(mealCost + tip + tax);

        System.out.println("The total meal cost is " +totalCost + " dollars");

    }
}
