package FirstStepsInCoding.lab;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
       // double prc = Double.parseDouble(scanner.nextLine());
       // System.out.println("The price is " + prc);
    }
}
