package Practice;
import java.util.Scanner;
public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the first side length");
        double num1 =scn.nextDouble();

        System.out.println("Enter the second side length");
        double num2 = scn.nextDouble();

        System.out.println("Enter the third side length");
        double num3 = scn.nextDouble();
        
        if(num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3> num1){
            System.out.println("This is a valid triangle ");
        }
        else{
            System.out.println("This is not a valid triangle");
        }
    scn.close();
    }
}
