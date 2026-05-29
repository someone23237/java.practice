package Array;

import java.util.Scanner;

class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Copy array
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Copied array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr2[i]);
        }

        sc.close();
    }
}

