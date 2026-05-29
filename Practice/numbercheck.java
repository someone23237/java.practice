package Practice;
import java.util.Scanner;
public class numbercheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hello, pls enter a number so that i can see if that number is above 0, below 0,or just 0:");
        int num=scn.nextInt();
        if(num>0){
            System.out.println("This number is above zero or called a positive number");
        }
        else if(num<0){
            System.out.println("This number is lower than 0 or called as a negative number");
        }
        else{
            System.out.println("This number is 0 :)");
        }
        scn.close();
        }
    }
    

