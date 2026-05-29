package Practice;
import java.util.Scanner;
public class Solidsquare {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("pick a number from 1 to 7:");
        int num=scn.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    scn.close();
    }
}
