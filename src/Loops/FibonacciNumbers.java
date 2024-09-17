package Loops;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 2; i <=n ; i++) {

            int temp = b;
            b = b + a;
            a = temp;
            
        }

        System.out.println("The "+n+"th fibinacci number is : "+b);
    }
}
