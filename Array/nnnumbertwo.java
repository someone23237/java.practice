package Array;

import java.util.Scanner;

public class nnnumbertwo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("The array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}