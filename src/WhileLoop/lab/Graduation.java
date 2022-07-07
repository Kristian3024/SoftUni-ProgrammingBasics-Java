package WhileLoop.lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        int grade=1;
        int failure=0;
        double sum=0;
        while(grade<=12){
            if (failure==2){
                System.out.printf("%s has been excluded at %d grade",name,grade);
                break;
            }
            double mark=Double.parseDouble(scanner.nextLine());
                if (mark<4){
                    failure++;
                    continue;
                }
                sum=sum+mark;
                if(grade==12){
                    System.out.printf("%s graduated. Average grade: %.2f",name,sum/12);
                }
                grade++;
        }
    }
}
