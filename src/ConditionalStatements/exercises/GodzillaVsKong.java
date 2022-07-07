package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int actor=Integer.parseInt(scanner.nextLine());
        double dress=Double.parseDouble(scanner.nextLine());
        double dresses=actor*dress;
        double decor=0.1*budget;
        if(actor>150){
            dresses=dresses*0.9;
        }
        if(decor+dresses>budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",decor+dresses-budget);
        } else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-(decor+dresses));
        }
    }
}
