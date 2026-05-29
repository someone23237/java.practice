package Practice;
import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter 3 numbers and thne il say the largest of them");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int num3=scn.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println("The largest number is "+num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("The largest number is "+num2);
        }
        else{
            System.out.println("The largest number is "+num3);
} 
scn.close();
    }
}
