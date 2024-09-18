package FunctionsOrMethods;

import java.util.Scanner;

public class PassingArgumentsTakenFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        String response = greet(name);
        System.out.println(response);
    }

    static String greet(String name){
        String greeting = "Hello "+name+" ! How are you ?";
        return greeting;
    }


}


