package Array;
import java.util.Scanner;
public class nnnumbersix {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter size");
        int n=scn.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter a number");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
            System.out.println("Enter element to search:");
        
            int key=scn.nextInt();

            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    System.out.println("Element found");
                    return;
                }
            }
            
        
    }
}