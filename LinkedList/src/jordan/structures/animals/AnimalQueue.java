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

    public void enqueueCat(String name){
        CatQueueNode newCat = new CatQueueNode();
        newCat.animalName = name;
        newCat.dateIn = LocalDateTime.now();

        _cats.add(newCat);
    }

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

    public void dequeueAnimal(){
        
    }

}
