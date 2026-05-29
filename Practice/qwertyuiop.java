package Practice;
import java.util.Scanner;
public class qwertyuiop {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         System.out.println("Enter the number of rows :) :");
         int rows=scn.nextInt();
         for(int i=1;i<=rows;i++){
            for(int j=i;j>=1;j--){
                System.out.println(j);
                
            }
            System.out.println();
         }
    scn.close();
    }
}
