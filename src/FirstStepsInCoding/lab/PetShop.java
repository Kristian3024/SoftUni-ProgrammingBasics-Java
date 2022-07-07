package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int dog=Integer.parseInt(scanner.nextLine());
        int cat=Integer.parseInt(scanner.nextLine());
        double result= dog*2.50 + cat*4;
        System.out.println(result + " lv.");
    }
}
