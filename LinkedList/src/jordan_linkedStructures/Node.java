/**
 * Created by Jordan on 5/25/2017.
 */
package jordan_linkedStructures;

public class Node<T>
{
    private T _value;
    private Node<T> Next;
    private Node<T> Last;

    public T get_value() {
        return _value;
    }

    public void set_value(T _value) {
        this._value = _value;
    }

    public Node<T> getNext() {
        return Next;
    }

    public void setNext(Node<T> next) {
        Next = next;
    }

    public Node<T> getLast() {
        return Last;
    }

    public void setLast(Node<T> last) {
        Last = last;
    }
}
