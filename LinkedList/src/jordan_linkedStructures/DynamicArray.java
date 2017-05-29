package jordan_linkedStructures;

/**
 * Created by Jordan on 5/28/2017.
 */
public class DynamicArray<T> {
    protected Object _array[];

    public DynamicArray(int arraySize){
        _array = new Object[arraySize];
    }

    public void Add(T item){
        int i = 0;

        while(i < _array.length && _array[i] != null)
            i++;

        if(i < _array.length)
            _array[i] = item;
        else{
            Object tempArray[] = _array.clone();
            _array = new Object[tempArray.length * 2];

            for(int j =0; j < tempArray.length; j++){
                _array[j] = tempArray[j];
            }

            Add(item);
        }
    }

    public T Get(int index){
        return (T)_array[index];
    }

    @Override
    public String toString(){
        String results = "";

        for(int i = 0; i < _array.length; i++){
            if(_array[i] != null)
                results += _array[i].toString() + ", ";
        }

        return results.substring(0, results.lastIndexOf(','));
    }
}
