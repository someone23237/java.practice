package Practice;

import java.util.Scanner;

public class oneooneo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a numberr :) :");
        int num=scn.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                    System.out.print("1");

                else
                    System.out.print("0");
                
           }
           System.out.println();
        }
    scn.close();
    }
}
