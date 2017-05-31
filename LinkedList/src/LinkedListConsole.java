/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.arraygarbage.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        int[] arrayOne, arrayTwo;
        Random rand = new Random();

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int k = in.nextInt();

        arrayOne = new int[i + k];
        arrayTwo = new int[k];

        for(int j = 0; j < i; j++){
            arrayOne[j] = (j * 15) + 1;
        }

        for(int j = 0; j < k; j++){
            arrayTwo[j] = rand.nextInt(100);
        }

        Arrays.sort(arrayTwo);

        SortFunctions.printArray(arrayOne);
        System.out.println();
        SortFunctions.printArray(arrayTwo);

        SortFunctions.sortedMerge(arrayOne, arrayTwo);
        System.out.println();

        SortFunctions.printArray(arrayOne);
    }
}
