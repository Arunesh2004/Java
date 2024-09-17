package Loops;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        /*
         syntax:

         for(initialization ; condition ; increment/decrement){

            //body

         */

//        for(int count = 1; count != 5; count++){
//            System.out.println("hello");
//        }
//
//        for(int count = 1; count <= 100; count++){
//            System.out.println(count);
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            System.out.println(i);

        }
    }
}
