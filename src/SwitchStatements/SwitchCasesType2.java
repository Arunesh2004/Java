package SwitchStatements;

import java.util.Scanner;

public class SwitchCasesType2 {

    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a fruit : ");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Grapes" -> System.out.println("Small in size but best in taste");
            case "Orange" -> System.out.println("Same color as name");
            default -> System.out.println("Please enter a fruit");
        }

    }
}
