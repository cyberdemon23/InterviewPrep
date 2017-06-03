package jordan.structures;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Jordan on 6/1/2017.
 */
public class Graph {
    private ArrayList<GraphNode> _graph = new ArrayList<>();
    private int _nodeCount = 0;

    public Graph(){

    }

    public Graph(int[] nodeValues, HashMap<Integer, int[]> edges){
        for(int value: nodeValues){
            int[] nodeEdges = edges.get(value);

            add(value, nodeEdges);
        }
    }

    public void add(int value, int[] adjacents){
        Random rand = new Random();
        GraphNode newNode = new GraphNode();
        newNode.value = value;

        for(int edge: adjacents) {
            newNode.adjacentNodes.put(edge, rand.nextInt(11));
        }

        _graph.add(newNode);

        _nodeCount++;
    }

    public GraphNode depthFirstSearch(int value){
        GraphNode _iterator = _graph.get(0);
        return depthFirstSearch(value, _iterator);
    }

    @Nullable
    private GraphNode depthFirstSearch(int value, GraphNode node){
        if(node.value == value)
            return node;

        node.visited = true;

        for(Integer adjacent: node.adjacentNodes.keySet()){
            GraphNode nextNodeToVisit = _graph.get(adjacent);
            if(!nextNodeToVisit.visited)
                return depthFirstSearch(value, nextNodeToVisit);
        }

        return null;
    }

    @Nullable
    public GraphNode breadthFirstSearch(int value){
        resetVisitedNodes();
        Queue<GraphNode> queue = new Queue<>();

        queue.enqueue(_graph.get(0));

        while(queue.getLength() > 0) {
            GraphNode node = queue.dequeue();
            node.visited = true;

            if (node.value == value)
                return node;

            for (Integer adjacent : node.adjacentNodes.keySet()) {
                GraphNode nextNodeToVisit = _graph.get(adjacent);
                if(!nextNodeToVisit.visited)
                    queue.enqueue(nextNodeToVisit);
            }
        }

        return null;
    }

    public void findShortestPath(int nodeA, int nodeB){
        GraphNode a = depthFirstSearch(nodeA);
        resetVisitedNodes();

        Queue<GraphNode> queue = new Queue<>();
        Queue<Integer> path = new Queue<>();

        queue.enqueue(a);

        while(queue.getLength() > 0) {
            GraphNode node = queue.dequeue();

            if(!node.visited) {
                path.enqueue(node.value);
                node.visited = true;
            }

            if (node.value == nodeB)
                break;

            for (Integer adjacent : node.adjacentNodes.keySet()) {
                GraphNode nextNodeToVisit = _graph.get(adjacent);
                if(!nextNodeToVisit.visited)
                    queue.enqueue(nextNodeToVisit);
            }
        }

//        while(path.getLength() > 0){
//            System.out.print(String.format("%d ", path.dequeue()));
//        }
    }

    public boolean pathExists(int nodeA, int nodeB){
        GraphNode node1 = depthFirstSearch(nodeA);
        resetVisitedNodes();
        GraphNode results = depthFirstSearch(nodeB, node1);

        return results != null;
    }

    private void resetVisitedNodes(){
        _graph.forEach(n-> n.visited = false);
    }

    public void printString(){

        for(GraphNode node: _graph){
            System.out.println(String.format("%d - ", node.value) + node.adjacentNodes.toString());
        }
    }
}
