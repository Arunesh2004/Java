package Overloading;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number : ");
//        int num = sc.nextInt();
//
//        boolean ans = isArmstrong(num);
//        System.out.println("Armstrong number ? "+ans);

        for (int i = 100; i < 1000; i++) {

            if(isArmstrong(i)){

                System.out.print(i + " ");
            }

        }
    }

    static boolean isArmstrong(int num){

        int original = num;
        int sum = 0;

        while (num > 0){

            int rem = num%10;
            num = num/10;
            sum = sum + rem*rem*rem;

        }
        if(sum == original){
            return true;
        }
        else{
            return false;
        }
    }
}
