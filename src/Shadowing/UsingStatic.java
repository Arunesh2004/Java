package Shadowing;

import java.util.Stack;

public class UsingStatic {
    static int x = 90; //this will be shadowed at line 12 because the lower level is overriding the upper level

    //shadowing --> a practice of using 2 variables with the same name within the scope that overlaps

    public static void main(String[] args) {
        System.out.println(x); //90

        int x;
//      System.out.println(x);  //this will show error because the scope only begins after the value is initialized

        x = 99; // since this is only available in this block .. the print function will use static x.
        System.out.println(x); //99

        print();
    }
    static void print(){
        System.out.println(x); // 90
    }
}
