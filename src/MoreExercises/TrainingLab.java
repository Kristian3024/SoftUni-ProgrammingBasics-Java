package MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double w =Double.parseDouble(scanner.nextLine());
        double h =Double.parseDouble(scanner.nextLine());
        w=w*100;
        h=h*100;
        h=h-100;
        double deskheight=Math.floor(h/70);
        double deskwidth=Math.floor(w/120);
        double total=deskheight*deskwidth-3;
        System.out.printf("%.0f",total);



    }
}
