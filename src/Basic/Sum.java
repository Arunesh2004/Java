package Basic;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Their sum is : "+sum);

    }
}
