package NestedLoops.lab;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int f = 1; f <= 10; f++) {
            for (int s = 1; s <= 10; s++) {
                System.out.printf("%d * %d = %d %n",f,s,f*s);
            }
        }
    }
}
