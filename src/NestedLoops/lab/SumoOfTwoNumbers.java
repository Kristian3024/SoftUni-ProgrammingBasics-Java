package NestedLoops.lab;

import java.util.Scanner;

public class SumoOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int br = 0;
        boolean flag = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                br++;

                if (i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", br, i, j, magic);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        if (flag == false) {
            System.out.printf("%d combinations - neither equals %d", br, magic);
        }
    }
}