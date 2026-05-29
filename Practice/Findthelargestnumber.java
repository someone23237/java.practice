package Practice;
import java.util.Scanner;
public class Findthelargestnumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("hello pls enter 2 numbers and ill find the largest value:");
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        if(num1>num2){
            System.out.println("The larger number is "+num1);
        }
        else{
            System.out.println("The larger number is "+num2);
        }
    scn.close();
}
}
