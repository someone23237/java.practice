package Practice;
import java.util.Scanner;
public class Fiveandeleven {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hello there! Give me a number and ill say if it is divisible by 5 and 11");
        int num=scn.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("THis number is divisible by 5 and 11!!");
        }
        else{
            System.out.println("This number is not divisible by 5 and 11...");
        }
    scn.close();
    }
}
