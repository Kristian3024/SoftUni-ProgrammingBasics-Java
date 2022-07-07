package MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double N=Double.parseDouble(scanner.nextLine());
        double M=Double.parseDouble(scanner.nextLine());
        int vegetables=Integer.parseInt(scanner.nextLine());
        int fruit=Integer.parseInt(scanner.nextLine());
        double sumBGN=vegetables*N + fruit*M;
        double sumEUR= sumBGN/1.94;
        System.out.printf("%.2f",sumEUR);
    }
}
