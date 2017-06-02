/**
 * Created by Jordan on 5/25/2017.
 */
import jordan.arraygarbage.SortFunctions;
import jordan.structures.Graph;
import jordan.structures.MaxHeap;

import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole {
    public static void main(String[] arguments) {
        Random rand = new Random();

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        Graph graph = new Graph();

        for(int k = 0; k < i; k++){
            graph.add(rand.nextInt(100), new int[0]);
        }

        //System.out.println(graph.toString());

//        System.out.println(String.format("Enter numbers from 1 - %d to find the shortest path between those nodes", i));
//        int node1 = in.nextInt() - 1;
//        int node2 = in.nextInt() - 1;


    }
}
