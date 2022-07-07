package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rate = scanner.nextLine();
        double discount = 0;
        double price = 0;
        double totalPrice=0;
        switch (type) {
            case "room for one person":
                price=18;
                if (days < 10) {
                    discount = 0;
                } else if (days <= 15) {
                    discount = 0;
                } else {
                    discount = 0;
                }
                break;
            case "apartment":
                price=25;
                if (days < 10) {
                    discount = 30;
                } else if (days <= 15) {
                    discount = 35;
                } else {
                    discount = 50;
                }
                break;
            case "president apartment":
                price=35;
                if (days < 10) {
                    discount = 10;
                } else if (days <= 15) {
                    discount = 15;
                } else {
                    discount = 20;
                }
                break;
        }
        totalPrice=(days-1)*price-discount*(days-1)*price/100;
        switch (rate){
            case "positive":
                totalPrice=totalPrice+25*totalPrice/100;
                break;
            case "negative":
                totalPrice=totalPrice-10*totalPrice/100;
                break;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
