package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPassingInFunction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Elements of the Array : ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.print("The elements in the array are : ");
        System.out.println(Arrays.toString(arr));

        change(arr);

        System.out.print("The elements in the array after modification are : ");
        System.out.println(Arrays.toString(arr));

    }

    static void change (int[] nums){

        nums[0] = 990;
    }
}
