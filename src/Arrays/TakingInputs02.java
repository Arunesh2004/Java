package Arrays;

import java.util.Scanner;

public class TakingInputs02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("The elements in the array are:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
