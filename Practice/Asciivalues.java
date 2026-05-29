package Practice;
import java.util.Scanner;
public class Asciivalues {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Hello there please enter a Uppercase alphabet and ill say what Ascii values it is! :) :");
         char ch=scn.next().charAt(0);
         if(ch>=65 && ch<=90){
            System.out.println("This is an uppercase aphabet");
         }
         else{
            System.out.println("This is a lowercase alphabet");
         }
    scn.close();
    }
}
