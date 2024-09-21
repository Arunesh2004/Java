package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInARange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter starting point: ");
        int start = sc.nextInt();

        System.out.print("Enter ending point: ");
        int end = sc.nextInt();

        int result = max(arr, start, end);
        if (result == -1) {
            System.out.println("Invalid range or array is null.");
        } else {
            System.out.print("Max element is: " + result);
        }
    }

    static int max(int[] arr, int start, int end) {


        if (arr == null || start > end || start < 0 || end >= arr.length) {
            return -1;
        }

        int max = arr[start];


        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}