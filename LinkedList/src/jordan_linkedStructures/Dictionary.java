package jordan_linkedStructures;

/**
 * Created by jordandukes on 5/29/17.
 */
public class Dictionary<K, V> {
    private KeyValuePair<K, V> _head;
    private KeyValuePair<K, V> _iterator;
    private KeyValuePair<K, V> _currentPos;

    public void Add(K key, V value){
        KeyValuePair<K, V> newKvp = new KeyValuePair<>();
        newKvp.set_key(key);
        newKvp.set_value(value);

        if(_head == null) {
            _head = newKvp;
            _currentPos = _head;
        }
        else {
            _iterator = _head;

            //look for the next empty location or to see if the key exists
            while (_iterator != null && _iterator.get_key() != key) {
                _iterator = _iterator.get_next();
            }

            if(_iterator != null){
                _iterator.set_value(value);
            }
            else{
                _currentPos.set_next(newKvp);
                _currentPos = _currentPos.get_next();
            }
        }
    }

    public V Get(K key){
        _iterator = _head;

        while(_iterator != null && _iterator.get_key() != key){
            _iterator = _iterator.get_next();
        }

        return _iterator.get_value();
    }

    public boolean ContainsKey(K key){
        _iterator = _head;

        while(_iterator != null && _iterator.get_key() != key){
            _iterator = _iterator.get_next();
        }

        if(_iterator.get_key() != null && _iterator.get_key() == key)
            return true;
        else
            return false;
    }
}
