/**
 * Created by Jordan on 5/25/2017.
 */
import jordan_linkedStructures.*;
import jordan.math.*;

import java.util.Random;
import java.util.Scanner;

public class LinkedListConsole
{
    public static void main ( String [] arguments )
    {
        DynamicArray<Integer> dArray;

        System.out.println("Please enter a number: ");
        Scanner in = new Scanner(System.in);
        Integer i = in.nextInt();
        Random rand = new Random();
        dArray = new DynamicArray<>(5);

        for(int j = 0; j < i; j++){
            dArray.Add(rand.nextInt(100));
        }

        System.out.println(dArray.toString());
    }
}
