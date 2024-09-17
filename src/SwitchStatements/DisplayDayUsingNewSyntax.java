package SwitchStatements;

import java.util.Scanner;

public class DisplayDayUsingNewSyntax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number from 1 to 7 : ");
        int n = sc.nextInt();

            switch (n){

                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Please enter a number from 1 to 7 only");
            }

    }
}
