package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter "+n+" Elements of the Array : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.next();

        }

        System.out.println(Arrays.toString(arr));
    }
}
