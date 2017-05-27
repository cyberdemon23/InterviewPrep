package jordan_linkedStructures;

/**
 * Created by Jordan on 5/26/2017.
 */
public class DoublyLinkedList<T> {
    private Node<T> _head;
    private Node<T> _tail;

    public void AddElement(T element){
        Node<T> newNode = new Node<>();
        newNode.set_value(element);

        if(_head == null){
            _head = newNode;
            _tail = _head;
            _tail.setLast(_head);
            _head.setNext(_tail);
        }
        else{
            newNode.setLast(_tail);
            _tail.setNext(newNode);
            _tail = _tail.getNext();
        }
    }

    public void AddElement(Node<T> newNode){
        if(_head == null){
            _head = newNode;
            _tail = _head;
            _tail.setLast(_head);
            _head.setNext(_tail);
        }
        else{
            newNode.setLast(_tail);
            _tail.setNext(newNode);
            _tail = _tail.getNext();
        }
    }

    public void AddElementAfter(Node<T> nodeAfter, T value){
        Node<T> newNode = new Node<>();
        newNode.set_value(value);

        Node<T> oldNextNode = nodeAfter.getNext();
        nodeAfter.setNext(newNode);
        newNode.setLast(nodeAfter);
        newNode.setNext(oldNextNode);
        oldNextNode.setLast(newNode);
    }

    public Node<T> Find(T value){
        Node<T> iterator = _head;

        while(iterator != null && iterator.get_value() != value )
            iterator = iterator.getNext();

        return iterator;
    }

    public boolean Delete(Node<T> nodeToDelete){
        Node<T> iterator = _head;

        while(iterator != nodeToDelete && iterator != null)
            iterator = iterator.getNext();

        if(iterator != null) {
            iterator.getLast().setNext(iterator.getNext());
            return true;
        }
        else
            return false;
    }

    public T GetMthValue(Integer m){
            Node<T> iterator = _tail;

            while(m > 0){
                iterator = iterator.getLast();
                m--;
            }

            return iterator.get_value();
    }

    @Override
    public String toString() {
        Node<T> iterator = _head;
        String results = "";

        while(iterator != null) {
            results += iterator.get_value().toString() + ", ";
            iterator = iterator.getNext();
        }

        results = results.substring(0, results.lastIndexOf(','));
        return results;
    }
}
