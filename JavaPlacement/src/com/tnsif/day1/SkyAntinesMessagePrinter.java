package com.tnsif.day1;

import java.util.Scanner;

public class SkyAntinesMessagePrinter {

    private String name;
    private String source;
    private String destination;

    public void gatherCustomerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter source: ");
        source = scanner.nextLine();

        System.out.print("Enter destination: ");
        destination = scanner.nextLine();

        // Close the scanner to prevent a resource leak
        scanner.close();
    }

    public void printMessage() {
        System.out.println("Dear " + name + ", welcome onboard with service from " + source + " to " + destination +
                ". Thank you for choosing Sky Airlines. Enjoy your flight.");
        System.out.flush(); // Flush the output
    }

    public static void main(String[] args) {
        SkyAntinesMessagePrinter messagePrinter = new SkyAntinesMessagePrinter();

        System.out.println("Sample Input:");

        // Gathering details for the first customer
        messagePrinter.gatherCustomerDetails();

        System.out.println("\nSample Output:");

        // Printing message for the first customer
        messagePrinter.printMessage();

        System.out.println("\nSample Input:");

        // Gathering details for the second customer
        messagePrinter.gatherCustomerDetails();

        System.out.println("\nSample Output:");

        // Printing message for the second customer
        messagePrinter.printMessage();
    }

    public static class IdentifiersDemo {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
        }
    }
}
