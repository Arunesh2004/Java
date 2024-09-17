package FunctionsOrMethods;

import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of "+a+" and "+b+" is :" +sum);
    }
}
