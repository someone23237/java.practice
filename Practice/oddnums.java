package Practice;
import java.util.Scanner;
public class oddnums {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter an number between 1 and 100");
        int num=scn.nextInt();
        for(int i=1;i<=num;i=i+2){
            System.out.println(i);
            
        }
        scn.close();
    }

}
