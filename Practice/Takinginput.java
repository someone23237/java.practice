package Practice;
import java.util.Scanner;
public class Takinginput {
    
    public static void main(String[] args) {
        System.out.println("Whats your name?");
        Scanner scn=new Scanner(System.in);
            String name=scn.nextLine();
            System.out.println("hello "+ name);
            System.out.println("I am AI and nice meeting you, " + name);
        scn.close();
        }
        
    }

