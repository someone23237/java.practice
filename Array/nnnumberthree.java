package Array;
import java.util.Scanner;
public class nnnumberthree {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr = new int [5];
        System.out.println("Enter 5 numbers");
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();
}
        System.out.println("Now we show the exact numbers or elements");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
