package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        /*
        Syntax:

        while(condition){

            //body

            increment/decrement

        }
         */

//        int count = 1 ;
//
//        while(count != 5){
//
//            System.out.println("Hello");
//            count++;
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int count = 0 ;
        while(count<=n){

            System.out.println(count);
            count++;
        }

    }
}
