package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type= scanner.nextLine();
        double cena=0;
        int r=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        switch(type){
            case "Premiere":
                cena=12;
                break;
            case "Normal":
                cena=7.5;
                break;
            case "Discount":
                cena=5;
                break;
        }
        System.out.printf("%.2f leva",cena*r*c);
    }
}
