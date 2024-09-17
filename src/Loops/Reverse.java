package Loops;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int answer = 0;
        int n2 = n;

        while (n != 0) {
            int remainder = n % 10;
            answer = answer * 10 + remainder;
            n = n / 10;
        }

        System.out.println("The reverse of "+n2+" is : "+answer);
    }
}
