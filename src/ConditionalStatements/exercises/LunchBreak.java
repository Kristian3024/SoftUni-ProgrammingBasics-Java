package ConditionalStatements.exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String show= scanner.nextLine();
        int showtime=Integer.parseInt(scanner.nextLine());
        int time=Integer.parseInt(scanner.nextLine());
        double newtime=time-time*0.125-time*0.25;
        if(newtime>=showtime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",show,Math.ceil(newtime-showtime));
        }
        else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",show,Math.ceil(showtime-newtime));
        }
    }
}
