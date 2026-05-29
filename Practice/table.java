package Practice;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter 1 number :) :");
         int num=scn.nextInt();
         for(int i=1;i<=10;i++){
            System.out.println(i+"x"+num+"="+i*num);
         }
         scn.close();
    }
}
