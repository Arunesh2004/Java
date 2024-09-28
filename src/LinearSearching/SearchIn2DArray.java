package LinearSearching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {{32 ,43 , 53, 67 , 53},
                       {67 ,42 ,23 ,44 ,49},
                       {69, 11 ,55},
                       {99 , 90 , 77 , 88}};

        int target = 44;

        int[] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr , int target){

        for (int row = 0 ; row < arr.length ; row++){

            for (int column = 0 ; column < arr[row].length ; column++){

                if (arr[row][column] == target){

                    return new int[]{row , column};
                }
            }
        }

        return new int[]{-1 , -1};
    }
}
