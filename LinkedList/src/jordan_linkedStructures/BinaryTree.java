package jordan_linkedStructures;

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

    public String BreadthFirstString(TreeNode<T> node){
        String results = "";

        if(node == null)
            return "";

        results += node.get_value().toString() + ", ";



        return results;
    }
}
