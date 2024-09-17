package SwitchStatements;

import java.util.Scanner;

public class SwitchCases {

    public static void main(String[] args) {

        /*
        Syntax :

        Switch(expression){

            //CASES

            Case one :

                //do something
                break;

            Case two:

                //do something
                break;

            default :

                //do something

         }
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a fruit : ");
        String fruit = sc.next();

        switch (fruit){

            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;

            case "Grapes":
                System.out.println("Small in size but best in taste");
                break;

            case "Orange":
                System.out.println("Same color as name");
                break;

            default:
                System.out.println("Please enter a fruit");

        }
    }
}
