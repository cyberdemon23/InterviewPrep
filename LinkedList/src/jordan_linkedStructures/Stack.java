package jordan_linkedStructures;

/**
 * Created by Jordan on 5/26/2017.
 */
public class Stack<T> {
    private Node<T> _head;

    public void Push(T value){
        Node<T> newNode = new Node<>();
        newNode.set_value(value);

        if(_head == null)
            _head = newNode;
        else
            newNode.setLast(_head);
            _head = newNode;
    }

    public T Pop() {
        T value = _head.get_value();

        _head = _head.getLast();

        return value;
    }
}
