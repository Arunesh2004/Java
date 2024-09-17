package Conditions;

import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number : ");
        int c = sc.nextInt();

        int max = a;

        if(max<b){

            max = b;

        }
        else if (max<c) {

            max = c;

        }
        else{

            max = a;

        }

        System.out.println("Largest number is : "+max);

    }
}
