package Practice.Looooops;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Pls enter a number and the ill say the tables of it until 10 :) :");
    int num=scn.nextInt();
    int result;
    for(int i=1;i<=10;i++ ){
        result=num*i;
        System.out.println(num + " multiplied by " + i + " is " + result);
    }    
    scn.close();
    }
}
