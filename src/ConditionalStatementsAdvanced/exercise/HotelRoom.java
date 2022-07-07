package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=scanner.nextLine();
        int number= Integer.parseInt(scanner.nextLine());
        double sPrice=0;
        double aPrice=0;
        double sdiscount=0;
        double adiscount=0;
        switch(month){
            case"May":
            case"October":
                sPrice=50;
                aPrice=65;
                if(number>14){
                    sdiscount=30;
                }
                else if(number>7){
                    sdiscount=5;
                }
                break;
            case"June":
            case"September":
                sPrice=75.2;
                aPrice=68.7;
                if(number>14){
                    sdiscount=20;
                }
                break;
            case"July":
            case"August":
                sPrice=76;
                aPrice=77;
                break;
        }
        if (number>14) {
            adiscount=10;
        }
        System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.",number*aPrice-number*aPrice*adiscount/100,number*sPrice-number*sPrice*sdiscount/100);
    }
}
