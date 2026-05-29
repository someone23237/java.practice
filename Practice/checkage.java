package Practice;
import java.util.Scanner;
public class checkage {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter your age and then i will see if that age is even or odd :) :");
        int num=scn.nextInt();
        if(num%2==0){
            System.out.println("According to my calculations the age will be approximately even");
        }
        else{
            System.out.println("According to my calculations the age will be approximately odd");
        }
    scn.close();}
}
