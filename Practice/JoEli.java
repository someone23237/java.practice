package Practice;
import java.util.Scanner;
public class JoEli {
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Pls Enter age :) :");
    int num=scn.nextInt();

    System.out.println("Pls Enter your graduations marks and tell what percent you get. :");
    double percentage=scn.nextDouble();

    if(num>=21 && num<=55 && percentage>=60){
        System.out.println("You are eligible to have a job interview :)");
    }
    else{
        System.out.println("Sorry you are not eligible have a job interview :(");
    }

   scn.close();} 
}
