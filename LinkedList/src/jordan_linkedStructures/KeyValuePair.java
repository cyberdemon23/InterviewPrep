package jordan_linkedStructures;

/**
 * Created by Jordan on 5/28/2017.
 */
public class KeyValuePair<K, V> extends Node<V> {
    private K _key;

    public K get_key() {
        return _key;
    }

    public void set_key(K _key) {
        this._key = _key;
    }
}
