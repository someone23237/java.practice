package Practice.Looooops;
import java.util.Scanner;
public class tentoone {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter your starting number :) :");
        int start=scn.nextInt();
        System.out.println("Now enter the ending number");
        int end=scn.nextInt();
        System.out.println("Numbers from"+start+"to"+end+"Arer");
        for(int i=start; i>=end;i--){
            System.out.println(i);
        }
    scn.close();
    }
}
