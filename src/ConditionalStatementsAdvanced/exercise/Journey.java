package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {   Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type="";
        double used=0;
        if (budget <= 100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                type="Camp";
                used=30*budget/100;
            }
            else{
                type="Hotel";
                used=70*budget/100;
            }
        }else if(budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                type="Camp";
                used=40*budget/100;
            }
            else{
                type="Hotel";
                used=80*budget/100;
            }
        }else {
            destination = "Europe";
            type="Hotel";
            used=90*budget/100;
        }
        System.out.printf("Somewhere in %s %n%s - %.2f",destination,type,used);
    }
}
