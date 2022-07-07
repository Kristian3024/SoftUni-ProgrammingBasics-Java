package ConditionalStatements.exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sec1=Integer.parseInt(scanner.nextLine());
        int sec2=Integer.parseInt(scanner.nextLine());
        int sec3=Integer.parseInt(scanner.nextLine());
        int totalsec=sec1+sec3+sec2;
        int totalmin=totalsec/60;
        totalsec=totalsec%60;
        if(totalsec<10){
            System.out.printf("%d:0%d",totalmin,totalsec);
        } else{
            System.out.printf("%d:%d",totalmin,totalsec);
        }



    }
}
