package Conditions;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if(a > 10){

            System.out.println("a is greater than 10");

        }
        else {

            System.out.println("a is smaller than 10");

        }
    }
}
