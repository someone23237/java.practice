import java.util.Scanner;

public class Elements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n=scn.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter the elements in the array");
    for(int i=0;i<n;i++){
         arr[i]=scn.nextInt();
    }
    System.out.println("Enter the element you want to find in an array");
    int d=scn.nextInt();
    int result=find(arr,d);
    System.out.println(result);
    }

    public static int find(int[] arr,int d){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                return i;
            }
        }
        return -1;
    }

}