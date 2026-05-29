package Practice;
import java.util.Scanner;
public class numberrangecheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter a number:");
        int num=scn.nextInt();
        if (num>=50 && num<=100){
            System.out.println("This number is between a 100 and 50");
        }
        else{
            System.out.println("This number is not between 100 and 50");
        }
        
    scn.close();
    }
}
