package jordan_linkedStructures;

/**
 * Created by Jordan on 5/26/2017.
 */

public class TreeNode<T extends Comparable<T>> {
    private T _value;
    private TreeNode<T> _leftNode;
    private TreeNode<T> _rightNode;

    public T get_value() {
        return _value;
    }

    public void set_value(T _value) {
        this._value = _value;
    }

    public TreeNode<T> get_leftNode() {
        return _leftNode;
    }

    public void set_leftNode(TreeNode<T> _leftNode) {
        this._leftNode = _leftNode;
    }

    public TreeNode<T> get_rightNode() {
        return _rightNode;
    }

    public void set_rightNode(TreeNode<T> _rightNode) {
        this._rightNode = _rightNode;
    }
}
