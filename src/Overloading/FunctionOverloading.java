package Overloading;

import java.util.Arrays;

public class FunctionOverloading {

    public static void main(String[] args) {

        //this is called function overloading i.e. when two functions have same name
        //they can be differentiated on the basis of types of arguments passed or no. of arguments passed
        fun(45);
        fun("Arunesh");
        fun(45 , 55);
        fun(34,56,89,22,34);

    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
