package Practice;
import java.util.Scanner;
public class Division {
   public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    System.out.println("Pls enter the first number: ");
    double num1=scn.nextDouble();
    System.out.println("Now enter a another number to divide the number you just put in now");
    double num2=scn.nextDouble();
    if(num2==0){
        System.out.println("any number cant be divided by zero");
    
    }
    else{
        double result = num1 / num2;
        System.out.println("Now according to my calculations this answers will be approximately," + result);
        scn.close();

    }

    

   } 
}
