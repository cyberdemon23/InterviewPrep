/**
 * Created by Jordan on 5/25/2017.
 */
import jordan_linkedStructures.*;
import jordan.math.*;

import java.util.Scanner;

public class LinkedListConsole
{
    public static void main ( String [] arguments )
    {
        BinaryTree<Integer> bTree = new BinaryTree<>();


        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Please enter a number: ");
        int y = in.nextInt();

        System.out.println(MathFunctions.Sub(x, y));


        //        bTree.Add(i);
//
//        while(i != -99) {
//            System.out.println("Please enter a number: ");
//            i = in.nextInt();
//            bTree.Add(i);
//        }

//        System.out.println(bTree.DepthFirstString());
    }
}
