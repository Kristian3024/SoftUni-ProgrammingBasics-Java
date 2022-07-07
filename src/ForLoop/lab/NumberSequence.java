package ForLoop.lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;
        for(int i=1; i<=n;i++){
            int num=Integer.parseInt(scanner.nextLine());
            if(maxNumber<num){
                maxNumber=num;
            }
            if(minNumber>num){
                minNumber=num;
            }
        }
        System.out.println("Max number: "+ maxNumber);
        System.out.println("Min number: "+ minNumber);
    }
}
