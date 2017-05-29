package jordan_linkedStructures;



/**
 * Created by Jordan on 5/28/2017.
 */
public class HashTable<K, V> {
    private int numberOfBuckets = 25;
    private DoublyLinkedList<KeyValuePair<K, V>>[] _list = new DoublyLinkedList[numberOfBuckets];

    public void Add(K key, V value){
        int bucket = GetBucket(key);

        if(_list[bucket] == null)
            _list[bucket] = new DoublyLinkedList<>();

        KeyValuePair<K, V> kvp = new KeyValuePair<>();
        kvp.set_key(key);
        kvp.set_value(value);

        _list[bucket].AddElement(kvp);
    }

    public boolean Exists(K key){
        int bucket = GetBucket(key);

        if(_list[bucket] == null)
            return false;


        //while(_list[bucket].Iterate() )
    }

    private int GetBucket(K key){
        return key.hashCode() % numberOfBuckets;
    }

}
