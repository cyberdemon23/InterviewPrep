package jordan.structures;

import org.jetbrains.annotations.Nullable;

/**
 * Created by Jordan on 6/1/2017.
 */
public class Graph {
    private GraphNode _head;
    private int _nodeCount = 0;

    public void add(int value, int[] adjacents){
        GraphNode newNode = new GraphNode();
        newNode.value = value;
        if(_head == null){
            _head = newNode;
        }

        //attempt to randomly add links so that we can test
        if(_nodeCount > 1){
            
        }

//        for(int i = 0; i < adjacents.length; i++){
//            newNode.adjacents.add(depthFirstSearch(adjacents[i]));
//        }

        _nodeCount++;
    }

    public GraphNode depthFirstSearch(int value){
        GraphNode _iterator = _head;
        return depthFirstSearch(value, _iterator);
    }

    @Nullable
    private GraphNode depthFirstSearch(int value, GraphNode node){
        if(node.value == value)
            return node;

        for(GraphNode adjacent: node.adjacents){
            return depthFirstSearch(value, adjacent);
        }

        return null;
    }
}
