package FunctionsOrMethods;

import java.util.Scanner;

public class FunctionReturningIntValue {

    public static void main(String[] args) {
       int result = sum();

        System.out.println("Sum is : " +result);
    }

    static int sum(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int sum = a + b;

        return sum;


    }
}
