package VariableArguments;

import java.util.Arrays;

public class VarArgs {

    //we use this when we don't know how many inputs we are giving

    public static void main(String[] args) {

        fun(3,5,67,44,22,56,21);  //will be internally stored as an array

    }

    static void fun(int ...v){  //this is internally taking it as an array of integers
        System.out.println(Arrays.toString(v));
    }
}
