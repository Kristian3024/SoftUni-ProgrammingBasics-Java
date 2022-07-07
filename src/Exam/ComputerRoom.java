package Exam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=scanner.nextLine();
        int hours=Integer.parseInt(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());
        String time=scanner.nextLine();
        double price=0;
        switch (month){
            case "march":
            case "april":
            case "may":
                if(time.equals("day")){
                    price=10.50;
                }
                else if(time.equals("night")){
                    price=8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if(time.equals("day")){
                    price=12.60;
                }
                else if(time.equals("night")){
                    price=10.20;
                }
                break;
        }
        if(people>=4){
            price*=0.9;
        }
if(hours>=5){
    price*=0.5;
}
        System.out.printf("Price per person for one hour: %.2f %nTotal cost of the visit: %.2f",price,price*hours*people);
    }
}
