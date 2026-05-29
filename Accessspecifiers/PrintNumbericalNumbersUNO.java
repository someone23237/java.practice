package Accessspecifiers;

import java.util.Scanner;

class PrintNumbericalsNumbersUNO {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();

        for (int i = num; i >=1; i--) {
            System.out.println(i);
        }

        scn.close();
    }
}
