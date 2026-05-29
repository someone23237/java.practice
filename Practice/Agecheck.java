package Practice;
import java.util.Scanner;
public class Agecheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the age:");
        int age=scn.nextInt();
        scn.nextLine();
        
        System.out.println("Enter the citizenship:");
        String citizenship= scn.nextLine();

        if(age>=18 && citizenship.equalsIgnoreCase("Indian")){
            System.out.println("You are eligible to vote;");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    scn.close();
    }
}
