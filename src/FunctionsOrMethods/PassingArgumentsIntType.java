package FunctionsOrMethods;

public class PassingArgumentsIntType {

    public static void main(String[] args) {

        int ans = sum(5,8);
        System.out.println("Sum = "+ans);

    }

    static int sum(int a, int b){

        int sum = a+b;
        return sum;
    }
}
