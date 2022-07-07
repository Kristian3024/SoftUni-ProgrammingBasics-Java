package FirstStepsInCoding.exercises;


import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker=Integer.parseInt(scanner.nextLine());
        int cleaner=  Integer.parseInt(scanner.nextLine());
        int percentage=  Integer.parseInt(scanner.nextLine());

        double firstprice = pen * 5.80 + marker * 7.20 + cleaner * 1.20;
        double discount=percentage* firstprice /100;
        double price= firstprice -discount;
        System.out.println(price);

    }
}
