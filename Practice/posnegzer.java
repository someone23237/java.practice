package Practice;
import java.util.Scanner;
public class posnegzer {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter a number:");
        int num=scn.nextInt();
        if(num>0){
            System.out.println("This number is positive");
        }
        else if(num<0){
            System.out.println("This number is negative");
        }
        else{
            System.out.println("This number is zero");
        }
        scn.close();
    }
}
