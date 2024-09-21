package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array : ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.print("Enter the indexes you want to swap : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Original Array : ");
        System.out.println(Arrays.toString(arr));

        swap(arr , a , b);

        System.out.print("After Swapping : ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr ,int index1 ,int index2 ){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }



}
