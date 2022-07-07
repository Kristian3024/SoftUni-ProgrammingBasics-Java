package WhileLoop.exercise;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
        int numO=0;
        int numN=0;
        int numC=0;
        String word="";
        while(!input.equals("End")){
            char letter=input.charAt(0);
            if((letter<'A' || letter>'Z') && (letter<'a' || letter>'z')){
                input = scanner.nextLine();
                continue;
            }
            if (input.equals("o") && numO==0) {
                numO++;
            } else if (input.equals("n") && numN==0) {
                numN++;
            } else if (input.equals("c") && numC==0) {
                numC++;
            }
            else{
                word+=input;
            }
            if((input.equals("c") || input.equals("n") || input.equals("o")) && numC>=1 && numN >= 1 && numO>=1){
                System.out.printf(word + " ");
                numC=0;
                numN=0;
                numO=0;
                word="";
            }
            input = scanner.nextLine();
        }
    }
}
