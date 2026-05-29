package Practice.Looooops;

import java.util.Scanner;

public class tablesmoded {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Pls enter a number and the ill say the tables of it until 10 :) :");
        int num = scn.nextInt();
        int result;
        System.out.println("Give me the start range so from where do you want to start? :");
        int start = scn.nextInt();
        System.out.println("Now where do you want to end it?");
        int end = scn.nextInt();
        for (int i = start; i<= end; i++) {
            result = num * i;
            System.out.println(num + " multiplied by " + i + " is " + result);
        }
        scn.close();
    }
}
