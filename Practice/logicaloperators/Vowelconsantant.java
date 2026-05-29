package Practice.logicaloperators;
import java.util.Scanner;
public class Vowelconsantant {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls Enter a character");
        char ch=scn.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println("This is a vowel");
        }
        else{
            System.out.println("This is a consonant");
        }
    scn.close();
    }
}
