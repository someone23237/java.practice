package Practice.Looooops;
import java.util.Scanner;
public class patterns {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Pls choose an number from 1 to 20 :) :");
int n=scn.nextInt();
for(int i=n;i<=1;i--){
 for(int j=1;j<=i;j++){
    System.out.print(j);
 }
 System.out.println();

}
}    
}
