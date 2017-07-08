/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.answers.LinkedListFunctions;
import jordan.answers.SparseSearch;
import jordan.arraygarbage.SortFunctions;
import jordan.sorting.MergeSort;
import jordan.sorting.QuickSort;

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
        int[] array = new int[i];

        for(int k = 0; k< i; k++){
            array[k] = rand.nextInt(101);
        }

        SortFunctions.printArray(array);
        System.out.println("");
        QuickSort.sort(array);
        SortFunctions.printArray(array);



    }
}
