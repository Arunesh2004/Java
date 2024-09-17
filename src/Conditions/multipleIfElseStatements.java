package Conditions;

import java.util.Scanner;

public class multipleIfElseStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age<=12){
            System.out.println("He is a kid and his age is : "+age);
        }

        else if (age>=13 && age<=19){
            System.out.println("He is a teenager and his age is : "+age);
        }

        else{
            System.out.println("He is an adult and his age is : "+age);
        }


    }
}
