package WhileLoop.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal=Integer.parseInt(scanner.nextLine());
        int sum=0;
        while(goal>sum){
            int num=Integer.parseInt(scanner.nextLine());
            sum=sum+num;
        }
        System.out.println(sum);
    }
}