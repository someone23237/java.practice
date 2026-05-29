package Practice;
import java.util.Scanner;
public class Pos2num{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number and then ill say if it is a positive 2-digit number");
        int num=scn.nextInt();
        if(num>10){
            System.out.println("This will be a positive 2-digit number");
        }
        else {
            System.out.println("This will not be a positive 2-digit number");
        }
    scn.close();
    }
}
