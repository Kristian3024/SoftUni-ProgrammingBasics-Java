package NestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("End")) {
            sum = 0;
            double price = Double.parseDouble(scanner.nextLine());
            while (sum < price) {
                double payment = Double.parseDouble(scanner.nextLine());
                sum += payment;
            }
            System.out.printf("Going to %s!%n", input);
            input = scanner.nextLine();
        }


    }
}
