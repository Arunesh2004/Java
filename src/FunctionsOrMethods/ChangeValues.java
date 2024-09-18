package FunctionsOrMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValues {

    public static void main(String[] args) {

        int[] arr = {1,4,6,7,8};

        change(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99;
    }
}

//here we are modifying the array
