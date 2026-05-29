package Practice;
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter a number so that i can say it is even or odd number ok? PLS:");
        int num= scn.nextInt();
        if(num%2==0){
            System.out.println("This is an even number because it is divisable by the number 2");
        }
        else{
            System.out.println("This is an odd number because it is not divisable by the number 2");
        }
        scn.close();
    }
    
}
