package Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the number elements");
        int n = scn.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements pls:");
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
            sum += arr[i];
        }
        double avj = (double) sum / n;
        System.out.println("The average," + avj);
    }
}
