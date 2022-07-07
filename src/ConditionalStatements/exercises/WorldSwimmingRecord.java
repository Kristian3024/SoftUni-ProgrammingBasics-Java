package ConditionalStatements.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double record=Double.parseDouble(scanner.nextLine());
        double length=Double.parseDouble(scanner.nextLine());
        double speed=Double.parseDouble(scanner.nextLine());
        double Ivan= length*speed+Math.floor(length/15)*12.5;
        if(Ivan<record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",Ivan);
        }
        else{
            System.out.printf("No, he failed! He was %.2f seconds slower.", Ivan-record);
        }



    }
}
