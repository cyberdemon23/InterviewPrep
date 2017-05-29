package jordan_linkedStructures;

import java.lang.reflect.Array;

/**
 * Created by jordandukes on 5/29/17.
 */
public class SortedArray<T extends Comparable<T>> extends DynamicArray<T> {

    public SortedArray(int arraySize){
        super(arraySize);
    }

    @Override
    public void Add(T item){
        super.Add(item);
        QuickSort(super._array, 0, super._array.length);
    }

    private int Partition(Object[] array, int low, int high){
        Object pivot = array[high];
        int i = low - 1;

        for(int j = low; i < high; j++){
            if((T)array[j].compareTo((T)pivot) <= 0){
                i++;

                Object temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        Object temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    private void QuickSort(Object[] array, int low, int high){
        if(low < high){
            int pi = Partition(array, low, high);

            QuickSort(array, low, pi-1);
            QuickSort(array, pi+1, high);
        }
    }


}
