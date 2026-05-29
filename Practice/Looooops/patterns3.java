package Practice.Looooops;
import java.util.Scanner;
public class patterns3 {
public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("What number do you choose from your opinion i would choose from 1 to 20");
int n=scn.nextInt();
for(int i=1;i<=n;i++){
    for(int space = 1; space<=n-i;space++){
        System.out.print(" ");
    }
    for(int star=1; star<=i;star++){
        System.out.print("*");   
    }
    System.out.println();

}

scn.close();
    }    
}
