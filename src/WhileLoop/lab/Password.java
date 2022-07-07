package WhileLoop.lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username= scanner.nextLine();
        String pass= scanner.nextLine();
        String attempt= scanner.nextLine();
        while(!attempt.equals(pass)){
            attempt= scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
