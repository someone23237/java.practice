package Practice;
import java.util.Scanner;
public class unoodd {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter am number pls :) :");
        int num=scn.nextInt();
        for(int i=num; i>=1; i=i-1){
            if(i%2!=0){
            System.out.println(i);
        }
        }
        scn.close();
    }
}
