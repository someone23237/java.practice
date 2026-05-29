package Practice;
import java.util.Scanner;
public class fivefourthreetwoone {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("choose a number from 1 to 40");
        int num=scn.nextInt();
        for(int i=num;i>=1;i--){
            for(int j=num;j>=num-i+1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    scn.close();
    }
}
