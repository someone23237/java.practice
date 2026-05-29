package homwork;
import java.util.Scanner;
public class Numberseven {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=scn.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("The square root of the number is"+i+"="+(i*i));
        }
    scn.close();
}
}
