package Practice;
import java.util.Scanner;
public class unoevennums {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter a number between from 1 to 10 and ill say every even numbers in reverse order! :");
        int num=scn.nextInt();

        for(int i=num; i>=1; i=i-1){
            if(i%2==0){
            System.out.println(i);
        }
    scn.close();
    }
}
}