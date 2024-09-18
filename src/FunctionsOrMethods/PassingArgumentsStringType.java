package FunctionsOrMethods;

public class PassingArgumentsStringType {

    public static void main(String[] args) {

        String res = greet("Arunesh");
        System.out.println(res);

    }

    static String greet(String name){
        String greeting = "Hello " +name+ "! How are you ?";
        return greeting;
    }
}
