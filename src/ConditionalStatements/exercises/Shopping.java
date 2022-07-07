package ConditionalStatements.exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int graphics=Integer.parseInt(scanner.nextLine());
        int processors=Integer.parseInt(scanner.nextLine());
        int ram=Integer.parseInt(scanner.nextLine());
        double price=graphics*250+graphics*250*0.35*processors+graphics*250*0.1*ram;
        if(graphics>processors){
            price=price*0.85;
        }
        if(budget>=price){
            System.out.printf("You have %.2f leva left!",budget-price);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva more!",price-budget);
        }
    }
}
