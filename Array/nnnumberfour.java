package Array;
import java.util.Scanner;
public class nnnumberfour {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
            System.out.println("Enter number of element");
            int n=scn.nextInt();
             int[] arr=new int[n];
            System.out.println("Enter " +n+ " Numbers!");
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
            }
            

        }
    }

