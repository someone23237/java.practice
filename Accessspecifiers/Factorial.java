package Accessspecifiers;

import java.util.Scanner;

class Factorial {
    void findFactorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of the number " + fact);
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number pls :) :");
        int num=scn.nextInt();
        
        Factorial obj=new Factorial();
        obj.findFactorial(num);
        
        scn.close();
    }
    
}
