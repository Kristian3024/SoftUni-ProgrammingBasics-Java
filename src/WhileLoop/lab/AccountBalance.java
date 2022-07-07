package WhileLoop.lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation= scanner.nextLine();
        double sum=0;

        while(!operation.equals("NoMoreMoney")){
            double num=Double.parseDouble(operation);
            if(num<0){
                System.out.println("Invalid operation!");
                break;
            }
            sum=sum+num;
            System.out.printf("Increase: %.2f %n",num);

            operation= scanner.nextLine();
        }
        System.out.printf("Total: %.2f",sum);
    }
}
