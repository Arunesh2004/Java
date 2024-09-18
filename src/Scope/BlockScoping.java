package Scope;

public class BlockScoping {

    public static void main(String[] args) {

        int a = 89;
        int b = 11;

        {
            a = 90;
            int c = 67;

            //values declared in this block will remain in this block
        }

        {

            int c = 99;

        }

//        System.out.println(c); // cannot use outside the blocks

        //but if some value is already declared outside the block (in the same method)--- we can modify it
        //and you cannot initialize it again

    }
}
