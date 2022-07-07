package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double area=Double.parseDouble(scanner.nextLine());
        double discount=18*area*7.61/100;
        double price= area*7.61 - discount;
        System.out.println("The final price is: " + price + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
