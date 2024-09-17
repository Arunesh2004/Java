package Basic;

import java.util.Scanner;

public class TypeConversionORTypeCasting {
    public static void main(String[] args) {

        //Type conversion : Converting one datatype into another
        //Conditions : the two datatypes must be compatible and the destination type should be greater than the source type ---> for this we can do typecasting

        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        System.out.println("After type conversion : " +num1);

        //typecasting

        int num2 = (int)(4578.565F);
        System.out.println("After typecasting : " +num2);

    }
}
