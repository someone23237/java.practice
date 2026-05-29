package Practice;

import java.util.Scanner;

public class HumanBody {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Tell me your body temperature in °C (without typing C):");

        double num = scn.nextDouble();

        if (num >= 37 && num <= 37.5) {
            System.out.println("This is a normal temperature.");
        } else {
            System.out.println("This is not a normal temperature. Cool down bro.");
        }
        scn.close();
    }
}
