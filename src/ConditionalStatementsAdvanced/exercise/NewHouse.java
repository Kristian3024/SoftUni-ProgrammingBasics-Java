package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type= scanner.nextLine();
        int number=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());
        double price=0;
        double discount=1;
        switch (type){
            case "Roses":
                price=5;
                if (number>80){
                    discount=0.90;
                }
                break;
            case "Dahlias":
                if (number>90){
                    discount=0.85;
                }
                price=3.8;
                break;
            case "Tulips":
                if (number>80){
                    discount=0.85;
                }
                price=2.8;
                break;
            case "Narcissus":
                if (number<120){
                    discount=1.15;
                }
                price=3;
                break;
            case "Gladiolus":
                if (number<80){
                    discount=1.20;
                }
                price=2.5;
                break;
        }
        double sum=number*price*discount;
if(budget>=sum){
    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",number,type,budget-sum);
}
else{
    System.out.printf("Not enough money, you need %.2f leva more.",sum-budget);
}
    }
}
