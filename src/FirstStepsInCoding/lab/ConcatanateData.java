package FirstStepsInCoding.lab;

import java.util.Scanner;

public class ConcatanateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname= scanner.nextLine();
        String lastname= scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town= scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstname,lastname, age, town );
    }
}