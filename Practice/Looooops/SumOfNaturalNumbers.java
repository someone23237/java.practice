package Practice.Looooops;
import java.util.Scanner;
public class SumOfNaturalNumbers {
 public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a number pls :");
    int num=scn.nextInt();
    int sum=0;
    for(int i=1;i<=num;i++){
        sum+=i;
        
    }
    System.out.println("Sum of 1st natural numbers is "+sum);
 scn.close();
    }
}
