package Practice;
import java.util.Scanner;
public class bankedybank {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Whats your monthly salary?");
        int num1=scn.nextInt();
        System.out.println("Ok, Ok, now whats your credits score?");
        int num2=scn.nextInt();
        if(num1>=30000 && num2>=700){
            System.out.println("You can take a bank loan");
        }
        else{
            System.out.println("Sorry, you can not take a bank loan...");
        }
    scn.close();
    }
}
