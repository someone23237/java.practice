package Practice;
import java.util.Scanner;
public class Addiition {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hello! Pls enter a number:");
        int num1=scn.nextInt();
        System.out.println("Now enter a another number to add that number you put?");
        int num2=scn.nextInt();
        int sum=num1+num2;
        System.out.println("Well the addition to this equation is " + sum);
        scn.close();
    }
    
}

