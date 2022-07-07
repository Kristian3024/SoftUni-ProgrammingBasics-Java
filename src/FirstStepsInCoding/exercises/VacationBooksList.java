package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int pages=Integer.parseInt(scanner.nextLine());
        int ph= Integer.parseInt(scanner.nextLine());
        int days=Integer.parseInt(scanner.nextLine());
        int chasove = pages/ph/days;
        System.out.println(chasove);
    }
}
