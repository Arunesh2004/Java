package FunctionsOrMethods;

public class StringReturnType {
    public static void main(String[] args) {

        String message = greet();

        System.out.println(message);

    }

    static String greet(){

        String greeting = "hello ! how are you ?";

        return greeting;

    }
}
