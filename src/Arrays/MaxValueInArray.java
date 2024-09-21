package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Fill the array : ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();

        }

        System.out.print("Array : ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Max element is : "+max(arr));

    }

    static int max(int[] arr){

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]> max){
                max = arr[i];
            }

        }

        return max;

    }
}
