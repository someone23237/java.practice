package Practice;
import java.util.Scanner;
public class Unoevenodd2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hello kind sir or madam, can u pls enter a number so then ill say in reverse order :) :");
        int num=scn.nextInt();
        for(int i=num;i>=1;i=i-1){

        if(i%2==0){
            System.out.println(i);
        }
        }
    scn.close();}
}
