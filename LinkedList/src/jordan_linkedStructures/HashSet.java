package jordan_linkedStructures;

/**
 * Created by Jordan on 5/28/2017.
 */
public class HashSet<T> {
    private Object _hashMap[];

    public HashSet(int hashSetSize){
        _hashMap = new Object[hashSetSize];
    }

    public void Add(T value){
        int hash = value.hashCode();

        _hashMap[hash] = value;
    }

    public T Get(int hash){
        return (T)_hashMap[hash];
    }
}
