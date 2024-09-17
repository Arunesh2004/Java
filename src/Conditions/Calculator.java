package Conditions;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while(true){

            System.out.print("Choose the operator : ");
            char ch = sc.next().trim().charAt(0);

            int a1 = 0;
            int b1 = 0;

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){

                System.out.print("Enter a number a : ");
                int a = sc.nextInt();
                System.out.print("Enter a number b : ");
                int b = sc.nextInt();


                a1 = a;
                b1 = b;


                if(ch == '+'){
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                if (ch == '/') {

                    if(b != 0){
                        ans = a / b;
                    }

                }
                if(ch == '%'){
                    ans = a%b;
                }

            }

            else if(ch == 'x' || ch == 'X') {

                break;

            }
            else {
                System.out.println("Invalid Operator");
            }

            System.out.println(a1+" "+ch+" "+b1+" = "+ans);
        }

    }
}
