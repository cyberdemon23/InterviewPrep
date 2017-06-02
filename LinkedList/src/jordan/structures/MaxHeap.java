package jordan.structures;
import jordan.arraygarbage.SortFunctions;

/**
 * Created by Jordan on 5/31/2017.
 */
public class MaxHeap {
    private int[] _array;
    private int _next = 0;
    private int _length = 0;

    public MaxHeap(int heapSize){
        _array = new int[heapSize];
    }

    public void add(int value){
        _array[_next] = value;
        _length++;

        int parent = _next == 1 ? 0 : ((_next + 1) / 2) - 1;
        int current = _next;
        if(parent < 0){
            _next++;
            return;
        }

        while(_array[current] > _array[parent]){
            SortFunctions.swap(_array, current, parent);
            current = parent;
            parent = current / 2;
        }

        _next++;
    }

    public void delete(){
        //swap the root with the last position
        SortFunctions.swap(_array, 0, _length - 1 );
        _next--;
        _length--;

        //heapify
        heapify(_array, 0);
    }

    public void heapify(int[] array, int i){
        if(i >= array.length - 1)
            return;

        //compare the root with its left child
        int leftChild = i == 0 ? 1 : (i * 2) + 1;

        //swap it if necessary
        if(leftChild < _length && array[i] < array[leftChild]){
            SortFunctions.swap(array, i, leftChild);
            heapify(array, leftChild);
        }

        //compare the root with its right child
        int rightChild = (i * 2) + 2;
        if(rightChild < _length && array[i] < array[rightChild]){
            SortFunctions.swap(array, i, rightChild);
            heapify(array, rightChild);
        }
    }

    public void buildHeap(int[] array){
        for(int i = (_length / 2); i >=0; i--){
            heapify(array, i);
        }
    }

    @Override
    public String toString(){
        String results = "";
        for(int i = 0; i < _length; i++){
            results += _array[i] + " ";
        }
        return results;
    }
}
