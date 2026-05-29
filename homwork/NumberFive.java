package homwork;
import java.util.Scanner;
public class NumberFive {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scn.nextInt();

        for(int i=1;i<=12;i++){
            System.out.println(i+"x"+num+"="+(i*num));
        }
    scn.close();    
    }
}
