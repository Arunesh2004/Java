package SwitchStatements;

import java.util.Scanner;

public class NestedSwitchCases {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Emp ID : ");
        int id = sc.nextInt();

        System.out.print("Enter Department : ");
        String dep = sc.next();

        switch (id) {
            case 1 -> {

                switch (dep) {
                    case "IT" -> System.out.println("His Emp ID is 1 and his name Arunesh and he is from IT Department");
                    case "Management" -> System.out.println("His Emp ID is 1 and his name Arunesh and he is from Management Department");
                }
            }
            case 2 -> {

                switch (dep) {
                    case "IT" -> System.out.println("His Emp ID is 2 and his name Abhishek and he is from IT Department");
                    case "Management" -> System.out.println("His Emp ID is 2 and his name Abhishek and he is from Management Department");
                }
            }
            case 3 -> {

                switch (dep) {
                    case "IT" -> System.out.println("His Emp ID is 3 and his name Nikhil and he is from IT Department");
                    case "Management" -> System.out.println("His Emp ID is 3 and his name Nikhil and he is from Management Department");
                }
            }
            default -> System.out.println("Please enter valid Emp ID");
        }
    }
}
