package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the default size of ArrayList : ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);

        System.out.println("Fill the Arraylist : ");

        for (int i = 0; i < 5; i++) {

            list.add(sc.nextInt());

        }

        System.out.println("Here is your ArrayList : ");
        for (int i = 0; i < 5; i++) {

            System.out.print(list.get(i) + " "); // list[index] syntax won't work

        }
    }



}
