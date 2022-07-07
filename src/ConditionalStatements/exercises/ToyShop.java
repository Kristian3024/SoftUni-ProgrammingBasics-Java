package ConditionalStatements.exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holiday = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double total=puzzles*2.6 + dolls*3+bears*4.1+minions*8.2+trucks*2;
        if(puzzles+dolls+bears+minions+trucks>=50){
            total=0.75*total;
        }
        total=0.9*total;
        if(total>=holiday){
            System.out.printf("Yes! %.2f lv left.",total-holiday);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.",holiday-total);

        }


    }
}
