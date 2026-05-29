package Array;

import java.util.Scanner;

public class nnnumberone {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int[] arr = new int[7];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < 6; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("The array elements are:");

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }
}