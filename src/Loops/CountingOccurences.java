package Loops;

import java.util.Scanner;

public class CountingOccurences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Enter the number you want to search : ");
        int s = sc.nextInt();

        int count = 0;
        int n2 = n;

        for (int i = 0; i <= n; i++ ) {

            int remainder = n%10;

            if(remainder == s){
               count++;
            }

            n = n/10;

        }

        System.out.println("The number of "+s+" in "+n2+" are : "+count);
    }
}
