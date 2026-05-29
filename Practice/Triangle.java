package Practice;
import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Pls enter the height");
        double height= scn.nextDouble();
        System.out.println("Pls enter the base");
        double base=scn.nextDouble();
        double area=0.5*height*base;
        System.out.println("The area of this triangle is "+area);
        scn.close();
    }
}
    

