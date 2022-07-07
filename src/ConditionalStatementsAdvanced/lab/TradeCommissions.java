package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city= scanner.nextLine();
        double s=Double.parseDouble(scanner.nextLine());
        double commission=0;
        switch (city){
            case "Sofia":
                if(s<=500 && s>0){
                    commission=5;

                } else if(s<=1000) {
                    commission=7;
                }
                else if (s<=10000) {
                    commission=8;
                }
                else if (s>10000){
                    commission=12;
                }
                else{
                    System.out.println("error");
                }
                break;
            case "Varna":
                if(s<=500 && s>0){
                    commission=4.5;

                } else if(s<=1000) {
                    commission=7.5;
                }
                else if (s<=10000) {
                    commission=10;
                }
                else if (s>10000){
                    commission=13;
                }
                else{
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if(s<=500 && s>0){
                    commission=5.5;

                } else if(s<=1000 && s>0) {
                    commission=8;
                }
                else if (s<=10000 && s>0) {
                    commission=12;
                }
                else if (s>10000 && s>0){
                    commission=14.5;
                }
                else{
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        if(s*commission/100!=0) {
            System.out.printf("%.2f", s * commission / 100);
        }
    }
}
