package Scope;

public class LoopScoping {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }

//        int a = i; // we cannot use this outside the loop

        // --> Anything that is declared outside, you can use inside (can't declare again) .. but anything declared inside , you can't use it outside (for all types of scoping)
    }
}
