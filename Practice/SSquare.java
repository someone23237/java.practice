package Practice;
import java.util.Scanner;
public class SSquare {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("welcome to the square calculator :). Pls enter  a number and then ill say the square of the number :) :");
        int num=scn.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("The square of "+i+" = "+i*i);
        }
    scn.close();}
}
