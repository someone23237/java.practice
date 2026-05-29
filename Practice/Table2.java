package Practice;
import java.util.Scanner;
public class Table2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Hello, pls eneter a word in the dictionary :)");
        int num=scn.nextInt();
        for(int i=1;i<=12;i++){
            System.out.println(i+"x"+num+"="+i*num);
        }
        scn.close();
    }
}
