package WhileLoop.exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int br = 0;
        int badMarks = 0;
        double sum = 0;
        String lastName = "";
        while (!input.equals("Enough")) {
            br+=1;
            double mark = Double.parseDouble(scanner.nextLine());
            ;
            if (mark <= 4) {
                badMarks++;
            }
            if (badMarks == number) {
                System.out.printf("You need a break, %d poor grades.", badMarks);
                break;
            }
            sum+=mark;
            lastName = input;
            input = scanner.nextLine();
        }
        if (badMarks < number) {
            System.out.printf("Average score: %.2f %nNumber of problems: %d %nLast problem: %s", sum / br, br, lastName);
        }
    }
}
