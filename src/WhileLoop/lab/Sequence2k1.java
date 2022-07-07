package WhileLoop.lab;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int p=1;
        while(num>=p){
            System.out.println(p);
            p+=p+1;
        }

    }
}
