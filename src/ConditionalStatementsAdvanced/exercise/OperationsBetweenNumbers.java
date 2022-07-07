package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        double result = 0;
        if (symbol.equals("+")) {
            result = n1 + n2;

            System.out.printf("%d %s %d = %.0f", n1, symbol, n2, result);
            if (result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        } else if (symbol.equals("-")) {
            result = n1 - n2;

            System.out.printf("%d %s %d = %.0f", n1, symbol, n2, result);
            if (result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        } else if (symbol.equals("*")) {
            result = n1 * n2;

            System.out.printf("%d %s %d = %.0f", n1, symbol, n2, result);
            if (result % 2 == 0) {
                System.out.println(" - even");
            } else {
                System.out.println(" - odd");
            }
        } else if (symbol.equals("/")) {
            if (n2 != 0) {
                result = 1.00 * n1 / n2;
                System.out.printf("%d %s %d = %.2f", n1, symbol, n2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        } else if (symbol.equals("%")) {
            if (n2 != 0) {
                result = n1 % n2;
                System.out.printf("%d %s %d = %.0f", n1, symbol, n2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", n1);
            }
        }
    }
}
