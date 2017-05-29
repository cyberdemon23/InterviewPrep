/**
 * Created by Jordan on 5/25/2017.
 */
import jordan_linkedStructures.*;
import jordan.math.*;

import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        SortedArray<Integer> array;
        Random rand = new Random();

        System.out.println("Please enter a string: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        array = new SortedArray<>(i);

        for(int j = 0; j < i; j++){
            array.Add(rand.nextInt(100));
        }

        System.out.println(array.toString());
    }
}
