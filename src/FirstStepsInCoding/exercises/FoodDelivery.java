package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish=Integer.parseInt(scanner.nextLine());
        int vegetarian=  Integer.parseInt(scanner.nextLine());

        double menusprice=chicken*10.35 + fish*12.40 + vegetarian*8.15;
        double dessert=20*menusprice/100;
        double suma=menusprice + dessert + 2.50;
        System.out.println(suma);
    }
}
