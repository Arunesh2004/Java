package Overloading;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean ans = isPrime(num);
        System.out.println("Prime ? "+ans);
    }

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }

        return c * c > n;
    }
}
