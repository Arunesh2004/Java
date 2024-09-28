package LinearSearching;

import java.util.Scanner;

public class ReturnElement {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        int[] arr = {45 , 54 , 32 , 34 , 23};

        int target = sc.nextInt();

        int res = LinearSearch(arr , target);

        System.out.println(res);

    }


    static int LinearSearch(int[] arr , int target){

        for(int value : arr){

            if(value == target){

                return value;
            }
        }

        return Integer.MAX_VALUE;
    }
}
