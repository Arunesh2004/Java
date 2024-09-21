package Arrays;

import java.util.ArrayList;

public class ArrayLists {

    //When you don't know how much size you want

    public static void main(String[] args) {

        /*
        Syntax :

        ArrayList<Datatype>list = new ArrayList<>(default size);

        here datatypes can't be primitive ... we use rapper class here

         */

        ArrayList<Integer> list = new ArrayList<>(5);

        //To add stuff into it ;
        list.add(55);
        list.add(56);
        list.add(54);
        list.add(43);

        //To print ;

        System.out.println(list);

    }
}
