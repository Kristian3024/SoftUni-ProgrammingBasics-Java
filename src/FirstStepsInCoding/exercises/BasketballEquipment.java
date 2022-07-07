package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int taksa= Integer.parseInt(scanner.nextLine());
        double kecove= 0.6*taksa;
        double ekip=kecove*0.8;
        double topka= ekip/4;
        double aksesoari=topka/5;
        double sum = taksa + kecove + ekip + topka + aksesoari;
        System.out.println(sum);

    }
}
