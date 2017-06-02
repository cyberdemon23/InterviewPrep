package jordan.structures;

import java.util.LinkedList;

/**
 * Created by Jordan on 6/1/2017.
 */
public class GraphNode {
    public int value = 0;
    public boolean visited = false;
    public LinkedList<GraphNode> adjacents;
}
