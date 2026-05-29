package Practice;
import java.util.Scanner;
public class Square{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter a number:");
        int num=scn.nextInt();
        for(int i=1;i<=num;i++){
            System.out.println("Square of "+i+"is"+i*i);
        }
    scn.close();}
}
