package Exam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceStr=Double.parseDouble(scanner.nextLine());
        double priceKor=Double.parseDouble(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());
        double designer=Double.parseDouble(scanner.nextLine());
        int team=Integer.parseInt(scanner.nextLine());
        double totalPrice=899*priceStr+2*priceKor-(899*priceStr+2*priceKor)*discount/100;
        totalPrice+=designer;
        totalPrice-=totalPrice*team/100;
        System.out.printf("Avtonom should pay %.2f BGN.",totalPrice);
    }
}
