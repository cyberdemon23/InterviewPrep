/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.answers.LinkedListFunctions;
import jordan.answers.SparseSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        Random rand = new Random();

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        List<Integer> list = new LinkedList<>();

        for(int k = 0; k< i; k++){
            list.add(rand.nextInt(101));
        }

        System.out.println(list);
        System.out.println(new LinkedListFunctions<Integer>().randomSubset(list));



    }
}
