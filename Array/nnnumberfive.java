package Array;
import java.util.Scanner;
public class nnnumberfive {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter your desired numbers pls:");
        int n=scn.nextInt();
        for(int i=0;i<5;i++){
            arr[i]=scn.nextInt();}
            System.out.println("Here are the numbers you said");
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Revered array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
