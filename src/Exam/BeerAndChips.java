package Exam;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        double budget=Double.parseDouble(scanner.nextLine());
        int beer=Integer.parseInt(scanner.nextLine());
        int chips=Integer.parseInt(scanner.nextLine());
        double sum=beer*1.20+ Math.ceil(beer*1.20*45/100*chips);
        if(budget>=sum){
            System.out.printf("%s bought a snack and has %.2f leva left.",name,budget-sum);
        }
        else{
            System.out.printf("%s needs %.2f more leva!",name,sum-budget);
        }
    }
}
