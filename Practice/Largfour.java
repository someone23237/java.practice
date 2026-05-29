package Practice;
import java.util.Scanner;
public class Largfour {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the first number;");
        int num1 = scn.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scn.nextInt();
        System.out.println("Enter the 3rd number:");
        int num3 = scn.nextInt();
        System.out.println("Enter the 4th number:");
        int num4 = scn.nextInt();

        if (num1>=num2 && num1>=num3 && num1>=num4){
            System.out.println("The largest number is "+num1);
        }
        else if (num2>=num1 && num2>=num3 && num2>=num4){
            System.out.println("The largest number is "+num2);
        }
        
        else if (num3>=num1 && num3>=num2 && num3>=num4){
            System.out.println("The largest number is "+num3);
    }
        else{
            System.out.println("The largest number is "+num4);
        }
    scn.close();
    }
}
