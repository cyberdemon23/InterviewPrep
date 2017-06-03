/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.arraygarbage.SortFunctions;
import jordan.structures.Graph;
import jordan.structures.GraphNode;
import jordan.structures.MaxHeap;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        Random rand = new Random();
//
//        System.out.println("Please enter a number: ");
//        Scanner in = new Scanner(System.in);
//        int i = in.nextInt();

        int[] array ={0, 1, 2, 3};

        HashMap<Integer, int[]> map = new HashMap<>();
        int[] edgeArray = {1};
        int[] edgeArray1 = {0, 2};
        int[] edgeArray2 = {0, 3};
        int[] edgeArray3 = {1, 3};
        map.put(0, edgeArray);
        map.put(1, edgeArray1);
        map.put(2, edgeArray2);
        map.put(3, edgeArray3);

        Graph graph = new Graph(array, map);
        graph.printString();

        graph.findShortestPath(0,3);

//        GraphNode node = graph.breadthFirstSearch(3);
//        if(node != null)
//        {
//            System.out.println("Found!");
//        }
    }
}
