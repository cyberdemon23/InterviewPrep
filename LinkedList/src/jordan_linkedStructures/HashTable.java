package jordan_linkedStructures;



/**
 * Created by Jordan on 5/28/2017.
 */
public class HashTable<K, V> {
    private int numberOfBuckets = 25;
    private Dictionary<K, V>[] _list = new Dictionary[numberOfBuckets];

    public void Set(K key, V value){
        int bucket = GetBucket(key);

        if(_list[bucket] == null)
            _list[bucket] = new Dictionary<>();

        _list[bucket].Add(key, value);
    }

    public V Get(K key){
        int bucket = GetBucket(key);

        if(_list[bucket] != null)
            return _list[bucket].Get(key);

        return null;
    }

    public boolean Exists(K key){
        int bucket = GetBucket(key);

        if(_list[bucket] == null)
            return false;

        return _list[bucket].ContainsKey(key);
    }

    private int GetBucket(K key){
        return key.hashCode() % numberOfBuckets;
    }

}
