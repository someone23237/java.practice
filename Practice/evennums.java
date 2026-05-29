package Practice;
import java.util.Scanner;
public class evennums {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("pls eneter a number and ill say every even number between that :) :");
        int num=scn.nextInt();
        for(int i=0;i<=num;i=i+2){
            System.out.println(i);
            
        }
        scn.close();
    }
}
