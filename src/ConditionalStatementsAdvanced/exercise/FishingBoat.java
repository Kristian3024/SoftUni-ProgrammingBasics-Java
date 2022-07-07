package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double budget=Double.parseDouble(scanner.nextLine());
        String season= scanner.nextLine();
        int fishers=Integer.parseInt(scanner.nextLine());
        double price=0;
        double discount=0;
        switch (season){
            case "Spring":
                price=3000;
                break;
            case "Summer":
                price=4200;
                break;
            case "Autumn":
                price=4200;
                break;
            case "Winter":
                price=2600;
                break;
        }
        if(fishers<=6){
            discount+=10;
        }
        else if(fishers>=7 && fishers<=11){
            discount+=15;
        }
        else if(fishers>=12){
            discount+=25;
        }
        if(fishers%2==0 && !(season.equals("Autumn"))){
            discount = discount + 5;
        }
        double sum=price-discount*price/100;
        if(budget>=sum){
            System.out.printf("Yes! You have %.2f leva left.",budget-sum);
        }
        else{
            System.out.printf("Not enough money! You need %.2f leva.",sum-budget);
        }
    }
}
