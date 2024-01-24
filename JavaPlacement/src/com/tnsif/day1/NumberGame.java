package com.tnsif.day1;

import java.util.Scanner;

class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        GameAnalyzer gameAnalyzer = new GameAnalyzer();
        System.out.println(gameAnalyzer.findSmallest(num1, num2, num3));

        // Close the scanner to prevent a resource leak
        scanner.close();
    }
}

class GameAnalyzer {
    String findSmallest(double num1, double num2, double num3) {
        double smallest = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        if (num1 == num2 && num2 == num3) {
            return "All numbers are equal";
        } else {
            return "The smallest number is: " + smallest;
        }
    }
}
