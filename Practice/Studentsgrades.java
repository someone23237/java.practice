package Practice;
import java.util.Scanner;
public class Studentsgrades {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Pls enter your grades percentage without the % :");
        int num=scn.nextInt();

        if(num>=90){
            System.out.println("You have an A");
        }
        else if(num>=75){
            System.out.println("You have a B");
        }
        else if(num>=60){
            System.out.println("You have a C");
        }
        else{
            System.out.println("You are failing this class");
        }
    scn.close();
    }
}
