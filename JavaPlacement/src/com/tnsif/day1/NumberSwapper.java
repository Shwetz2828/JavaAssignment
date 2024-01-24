package com.tnsif.day1;

import java.util.Scanner;

public class NumberSwapper {
    private int first;
    private int second;

    public NumberSwapper() {
        // Default constructor
    }

    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        this.first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        this.second = scanner.nextInt();

        // Close the scanner to release resources
        scanner.close();
    }

    public void swapNumbers() {
        this.first = this.first + this.second;
        this.second = this.first - this.second;
        this.first = this.first - this.second;
    }

    public void displayResult() {
        System.out.println("After swapping:");
        System.out.println("First number: " + this.first);
        System.out.println("Second number: " + this.second);
    }

    public static void main(String[] args) {
        NumberSwapper numberSwapper = new NumberSwapper();

        // Get user input
        numberSwapper.getInput();

        // Swap numbers
        numberSwapper.swapNumbers();

        // Display the result
        numberSwapper.displayResult();
    }
}
