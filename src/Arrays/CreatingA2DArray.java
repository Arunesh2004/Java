package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingA2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the the no. of rows : ");
        int r = sc.nextInt();

        System.out.print("Enter the the no. of columns : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        //INPUT

        System.out.println("Fill the array : ");

        for (r = 0; r < arr.length; r++) {

            for (c = 0; c < arr[r].length; c++) {

                arr[r][c] = sc.nextInt();

            }

        }

        //OUTPUT

        System.out.println("Output : ");

        for (r = 0; r < arr.length; r++) {

            System.out.println(Arrays.toString(arr[r]));

        }

    }
}
