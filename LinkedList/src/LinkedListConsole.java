/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.answers.AnimalShelterQueue;
import jordan.answers.CompressString;
import jordan.arraygarbage.SortFunctions;
import jordan.structures.Graph;
import jordan.structures.GraphNode;
import jordan.structures.MaxHeap;
import jordan_linkedStructures.BinaryTree;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        Random rand = new Random();

        System.out.println("Please enter a string: ");
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(CompressString.compress(s));
    }
}
