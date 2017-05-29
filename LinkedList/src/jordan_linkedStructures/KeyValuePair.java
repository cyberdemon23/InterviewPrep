package jordan_linkedStructures;

/**
 * Created by Jordan on 5/28/2017.
 */
public class KeyValuePair<K, V> {
    private K _key;
    private V _value;
    private KeyValuePair<K, V> _next;

    public K get_key() {
        return _key;
    }

    public void set_key(K _key) {
        this._key = _key;
    }

    public V get_value() {
        return _value;
    }

    public void set_value(V _value) {
        this._value = _value;
    }

    public KeyValuePair<K, V> get_next() {
        return _next;
    }

    public void set_next(KeyValuePair<K, V> _next) {
        this._next = _next;
    }
}
