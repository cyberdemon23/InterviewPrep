package jordan.structures.animals;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 * Created by jordandukes on 6/3/17.
 */
public class AnimalQueue {
    private LinkedList<AnimalQueueNode> _cats = new LinkedList<>();
    private LinkedList<AnimalQueueNode> _dogs = new LinkedList<>();
    private int _animals = 0;

    public void enqueueAnimal(String name, boolean isCat){
        AnimalQueueNode node = new AnimalQueueNode();
        node.animalName = name;
        node.dateIn = LocalDateTime.now();

        if(isCat)
            _cats.add(node);
        else
            _dogs.add(node);

        _animals++;
    }

    public AnimalQueueNode dequeueAnimal(){
        _animals--;
        AnimalQueueNode node;
        if(_cats.peekFirst().dateIn.compareTo(_dogs.peekFirst().dateIn) < 0){
            node = _cats.getFirst();
            _cats.removeFirst();
            return node;
        }
        else{
            node = _dogs.getFirst();
            _dogs.removeFirst();
            return node;
        }
    }

    public AnimalQueueNode dequeueDog(){
        _animals--;
        return _dogs.getFirst();
    }

    public AnimalQueueNode dequeueCat(){
        _animals--;
        return _dogs.getFirst();
    }

}
