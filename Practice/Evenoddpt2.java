package Practice;

import java.util.Scanner;

public class Evenoddpt2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Now enter a number and then ill say if it even or odd. PLS :) :");
        int num=scn.nextInt();
        if(num%2==0){
            System.out.println("This number is even, thank me later.");
        }
        else{
            System.out.println("This number is odd, thank me later.");
        }
    scn.close();}
}
