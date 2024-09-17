package Basic;

public class AutomaticTypePromotion {
    public static void main(String[] args) {

        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // max limit of byte is 256 so this is doing 257%256 and returning the remainder

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c*d/e;
        System.out.println(f);
        //since, c*d = 2000 and byte can only store upto 256, the system is
        //converting the bytes into integers to solve the expression

//        byte g = 56;
//        g = g*2;   will show error because it is automatically converted into int and we can't store it into byte

        int num1 = 'A';
        System.out.println(num1); // will use ASCII value a = 97 and A = 65
    }
}
