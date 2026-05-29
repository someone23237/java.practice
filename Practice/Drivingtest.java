package Practice;
import java.util.Scanner;
public class Drivingtest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hello there, i will be telling you oif are elligible to drive or not. So pls enter your age:");
        int age=scn.nextInt();
        System.out.println("Have you passed the test?(true/false)");
        boolean passedTest=scn.nextBoolean();
        if(age>=18 && passedTest==true){
            System.out.println("You are elligible for a driving liecenece");
        }
        else{
            System.out.println("sorry your not elligable for a driving test :(");
        }

    scn.close();
    }
}
