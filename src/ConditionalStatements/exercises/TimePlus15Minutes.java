package ConditionalStatements.exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        if (min >= 45) {
            hour = hour + 1;
            min = min - 60;
            if (hour == 24) {
                hour = 0;
            }
        }
        min=min+15;
        if (min < 10) {
            System.out.printf("%d:0%d", hour, min);
        } else {
            System.out.println(hour+":"+min);
        }
    }
}