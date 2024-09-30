package LinearSearching;

import java.util.Arrays;

public class FindMaxIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {{32 ,43 , 53, 67 , 53},
                {67 ,42 ,23 ,44 ,49},
                {69, 11 ,55},
                {99 , 90 , 77 , 88}};



        int ans = max(arr);

        System.out.println(ans);

    }

    static int max(int[][] arr){

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] > max){

                    max = arr[row][col];

                }

            }

        }

        return max;

    }
}
