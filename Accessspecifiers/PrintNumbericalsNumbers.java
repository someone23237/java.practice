package Accessspecifiers;
import java.util.Scanner;
class PrintNumbericalsNumbers {
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=scn.nextInt();

    for (int i=1; i<= num; i++) {
        System.out.println(i);
    }


    
scn.close();
}
}