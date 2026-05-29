package Practice;
import java.util.Scanner;
public class LepYear {
    public static void main(String[] sudeep) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter a year and ill say if it is a leap year or not. The year can not be lower than the 1900's");
        int num=scn.nextInt();
    if(num>1900 && num%4==0){
        System.out.println("This is a leap year");
    }
    else{
        System.out.println("This is not a leap year or it is lower than the 1900's");
    }
    scn.close();}
}
