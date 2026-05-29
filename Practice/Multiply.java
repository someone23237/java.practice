package Practice;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Now pls enter a number and then i'll ask you another number so i can multiply those to numbers :) :");
        int num1=scn.nextInt();
        System.out.println("Now enter a another number so i can multiply those two numbers :) :");
        int num2=scn.nextInt();
        int result=num1*num2;
        System.out.println(result);
        scn.close();
    }
}
