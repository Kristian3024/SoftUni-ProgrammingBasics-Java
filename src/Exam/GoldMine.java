package Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationNum = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= locationNum; i++) {
            double sum=0;
            double goalGold = Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <=days ; j++) {
                double gold=Double.parseDouble(scanner.nextLine());
                sum+=gold;
            }
            if(sum/days>=goalGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n",sum/days);
            }
            else{
                System.out.printf("You need %.2f gold.%n",goalGold-sum/days);
            }
        }
    }
}
