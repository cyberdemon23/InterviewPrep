/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.answers.LinkedListFunctions;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        Random rand = new Random();

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list.add(6);
        list.add(1);
        list.add(7);

        list2.add(2);
        list2.add(9);
        list2.add(5);

        System.out.println(new LinkedListFunctions<Integer>().sumLinkedListValues(list, list2));

    }
}
