package Practice;
import java.util.Scanner;
public class forlop {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
         System.out.println("Pls the number 10 to 1 ");
         int num = scn.nextInt();
            for(int i=num; i<=10; i=i+1){
                System.out.println(i);
         }scn.close();
    }
    
}
