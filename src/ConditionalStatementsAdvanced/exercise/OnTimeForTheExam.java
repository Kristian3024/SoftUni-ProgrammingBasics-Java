package ConditionalStatementsAdvanced.exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHr=Integer.parseInt(scanner.nextLine());
        int examMin=Integer.parseInt(scanner.nextLine());
        int hr=Integer.parseInt(scanner.nextLine());
        int min=Integer.parseInt(scanner.nextLine());
        int examAllMin=60*examHr+examMin;
        int allMin=60*hr+min;
        String arrival="";
        if(examAllMin==allMin || (examAllMin>allMin && examAllMin-allMin<=30)){
            arrival="On Time";
        }
        else if(examAllMin-allMin>30){
            arrival="Early";
        }
        else{
            arrival="Late";
        }
        System.out.println(arrival);
        if(examAllMin-allMin>0 && examAllMin-allMin<60){
            System.out.printf("%d minutes before the start",examAllMin-allMin);
        }
        else if(examAllMin-allMin>=60){
            System.out.printf("%d:%02d hours before the start",(examAllMin-allMin)/60,(examAllMin-allMin)%60);
        }
        else if(allMin-examAllMin>0 && allMin-examAllMin<60){
            System.out.printf("%d minutes after the start",allMin-examAllMin);
        }
        else if(allMin-examAllMin>=60){
            System.out.printf("%d:%02d hours after the start",(allMin-examAllMin)/60,(allMin-examAllMin)%60);
        }
    }
}
