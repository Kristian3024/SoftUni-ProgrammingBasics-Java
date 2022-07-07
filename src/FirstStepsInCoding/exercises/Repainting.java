package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nailon = Integer.parseInt(scanner.nextLine());
        double boq = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int chasove = Integer.parseInt(scanner.nextLine());
        nailon = nailon + 2;
        boq = boq + boq / 10;
        double materiali = nailon * 1.5 + boq * 14.50 + razreditel * 5 + 0.40;
        double maistori = 30 * materiali / 100;
        double suma = materiali + maistori * chasove;
        System.out.println(suma);
    }
}
