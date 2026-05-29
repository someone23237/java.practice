package Practice.logicaloperators;
import java.util.Scanner;
public class Vowelconsanant {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pick a character");
        char ch=scn.next().charAt(0);

        ch=Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("This is a vowel");
        } else {
            System.out.println("This is a consonant");
        }
        
    scn.close();
    }
}

