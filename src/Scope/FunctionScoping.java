package Scope;

public class FunctionScoping {

    public static void main(String[] args) {

        int a = 89;
        int b = 11;



//        System.out.println(num); // cannot use since num was defined in some other function

    }

    static void sum(){
//        int num = a + b;  // cannot use since a and b were defined in main function

    }
}
