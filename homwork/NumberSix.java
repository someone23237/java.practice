package homwork;

import java.util.Scanner;

public class NumberSix {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter N so i can print all the number between 1 and N: ");
        int n=scn.nextInt();

        int sum = 0;
        for (int i=1;i<=n;i++) {
            sum+=i;
        }

        System.out.println("Sum = "+sum);
        scn.close();
    }
}
