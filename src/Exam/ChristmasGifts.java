package Exam;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        int kids=0;
        int adults=0;
        while(!input.equals("Christmas")){
            int age=Integer.parseInt(input);
            if(age<=16){
               kids++;
            }
            else{
                adults++;

            }
            input= scanner.nextLine();
        }
        System.out.printf("Number of adults: %d %nNumber of kids: %d %nMoney for toys: %d %nMoney for sweaters: %d %n",adults,kids,kids*5,adults*15);
    }
}
