package jordan.structures;

import java.util.LinkedList;

/**
 * Created by Jordan on 6/1/2017.
 */
public class Queue {
    private LinkedList<Integer> _list = new LinkedList<>();
    private int _length = 0;

    public Queue(){

    }

    public void enqueue(Integer value){
        _list.add(value);
        _length++;
    }

    public Integer dequeue(){
        Integer value = _list.getFirst();
        _list.removeFirst();
        _length--;

        return value;
    }

    public int getLength(){
        return _length;
    }
}
