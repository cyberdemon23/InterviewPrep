package jordan.structures;

import java.util.LinkedList;

/**
 * Created by Jordan on 6/1/2017.
 */
public class Queue<T> {
    private LinkedList<T> _list = new LinkedList<>();
    private int _length = 0;

    public Queue(){

    }

    public void enqueue(T value){
        _list.add(value);
        _length++;
    }

    public T dequeue(){
        T value = _list.getFirst();
        _list.removeFirst();
        _length--;

        return value;
    }

    public int getLength(){
        return _length;
    }
}
