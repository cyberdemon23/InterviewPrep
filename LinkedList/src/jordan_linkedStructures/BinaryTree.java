package jordan_linkedStructures;

import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Jordan on 5/26/2017.
 */
public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> _root;

    public void Add(T value) {
        TreeNode<T> newNode = new TreeNode<>();
        newNode.set_value(value);

        if (_root == null)
            _root = newNode;
        else
            Add(_root, newNode);
    }

    private void Add(TreeNode<T> rootNode, TreeNode<T> newNode) {
        //Return out if duplicate
        if (rootNode.get_value().compareTo(newNode.get_value()) == 0)
            return;

        if (rootNode.get_value().compareTo(newNode.get_value()) < 0) {
            //Greater than the root add it to the right node
            if (rootNode.get_rightNode() == null)
                rootNode.set_rightNode(newNode);
            else
                Add(rootNode.get_rightNode(), newNode);
        } else {
            if (rootNode.get_leftNode() == null)
                rootNode.set_leftNode(newNode);
            else
                Add(rootNode.get_leftNode(), newNode);
        }
    }

    public boolean DepthFirstSearch(T value) {
        boolean results = false;

        results = DepthFirstSearch(_root, value);

        return results;
    }

    private boolean DepthFirstSearch(TreeNode<T> node, T value) {
        //We've hit the end
        if (node == null)
            return false;

        int comparison = node.get_value().compareTo(value);
        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            return DepthFirstSearch(node.get_rightNode(), value);
        } else {
            return DepthFirstSearch(node.get_leftNode(), value);
        }
    }

    public TreeNode<T> Search(T value) {
        TreeNode<T> results;

        results = Search(_root, value);

        return results;
    }

    private TreeNode<T> Search(TreeNode<T> node, T value) {
        //We've hit the end
        if (node == null)
            return null;

        int comparison = node.get_value().compareTo(value);
        if (comparison == 0) {
            return node;
        } else if (comparison < 0) {
            return Search(node.get_rightNode(), value);
        } else {
            return Search(node.get_leftNode(), value);
        }
    }

    public String DepthFirstString() {
        return DepthFirstString(_root);
    }

    private String DepthFirstString(TreeNode<T> node) {
        String results = "";

        if (node == null)
            return "";

        if (node.get_leftNode() != null)
            results += DepthFirstString(node.get_leftNode());

        results += node.get_value().toString() + ", ";

        if (node.get_rightNode() != null)
            results += DepthFirstString(node.get_rightNode());

        return results;
    }

    public String BreadthFirstString(){
        String results = _root.get_value().toString() + ", ";

        //Get the children of the root
        DoublyLinkedList<TreeNode<T>> currentLevel = new DoublyLinkedList<>();
        currentLevel.AddElement(_root.get_leftNode());
        currentLevel.AddElement(_root.get_rightNode());

        return results;
    }

    public String PreOrderPrint(){
        return PreOrderPrint(_root);
    }

    private String PreOrderPrint(TreeNode<T> node){
        String results = "";

        if(node == null)
            return "";

        results += node.get_value().toString() + ", ";
        results += PreOrderPrint(node.get_leftNode());
        results += PreOrderPrint(node.get_rightNode());

        return results;
    }

    public String PreOrderPrintNoRecursion(){
        return PreOrderPrint(_root);
    }

    public String PreOrderPrintNoRecursion(TreeNode<T> node){
        String results = "";
        TreeNode<T> currentNode;
        Stack<TreeNode<T>> stack = new Stack<>();

        stack.Push(_root);

        while(stack.Size() > 0){
            currentNode = stack.Pop();

            if(currentNode != null){
                results = currentNode.get_value().toString() + ", ";
                stack.Push(currentNode.get_rightNode());
                stack.Push(currentNode.get_leftNode());
            }
        }

       return results;
    }

    public int GetHeight(TreeNode<T> startingNode) {
        if (startingNode == null)
            return 0;

        return 1 + Math.max(GetHeight(startingNode.get_leftNode()), GetHeight(startingNode.get_rightNode()));
    }

    public LinkedList<T> generateLinkedList(){
        TreeNode<T> iterator = _root;
        LinkedList<T> results = new LinkedList<>();
        return generateLinkedList(_root, results);
    }

    private LinkedList<T> generateLinkedList(TreeNode<T> node, LinkedList<T> results){
        if(node == null)
            return null;

        generateLinkedList(node.get_leftNode(), results);
        results.add(node.get_value());
        generateLinkedList(node.get_rightNode(), results);

        return results;
    }
}
