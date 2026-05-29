package Practice;
import java.util.Scanner;
public class Sumofwhole {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("PLs enter a number in the dictonary :) :");
        int num=scn.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    scn.close();}
}
