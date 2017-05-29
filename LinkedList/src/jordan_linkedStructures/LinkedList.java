package jordan_linkedStructures;

/**
 * Created by Jordan on 5/25/2017.11
 */
public class LinkedList<T> {
    private Node<T> _head;
    private Node<T> _currentPosition;
    private Node<T> _iterator;
    private int _length = 0;

    public LinkedList(){
        _head = new Node<>();
    }

    public void AddElement(T element){
        Node<T> newNode = new Node<>();
        newNode.set_value(element);
        if(_length == 0){
            _head = newNode;
            _currentPosition = _head;
        }
        else{
            _currentPosition.setNext(newNode);
            _currentPosition = _currentPosition.getNext();
        }

        _length++;
    }

    public void AddElement(Node<T> newNode){
        if(_length == 0) {
            _head = newNode;
            _currentPosition = _head;
        }
        else {
            _currentPosition.setNext(newNode);
            _currentPosition = _currentPosition.getNext();
        }
    }

    public T GetValueAt(int index){
        _iterator = _head;

        for(int i = 0; i < index; i++){
                if(i == index)
                    break;
                else{
                    _iterator = _iterator.getNext();
                    i++;
                }
        }

        return _iterator.get_value();
    }

    public T GetMthValue(Integer m){
        Node<T> iterator = _head;
        Node<T> mBehind = iterator;

        for(Integer i =0; i < m; i++){
            if(iterator.getNext() != null){
                iterator = iterator.getNext();
            }
        }

        while(iterator.getNext() != null){
            iterator = iterator.getNext();
            mBehind = mBehind.getNext();
        }

        return mBehind.get_value();
    }

    public T Iterate(){
        if(_iterator == null) {
            _iterator = _head;
            return _iterator.get_value();
        }

        _iterator = _iterator.getNext();
        if(_iterator != null)
            return _iterator.get_value();
        else
            return null;
    }

    @Override
    public String toString() {
        Node<T> iterator = _head;
        String results = "";

        while(iterator != null) {
            results += iterator.get_value().toString() + ", ";
            iterator = iterator.getNext();
        }

        results = results.substring(0, results.lastIndexOf(','));
        return results;
    }
}

