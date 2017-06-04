package jordan.answers;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by jordandukes on 6/4/17.
 */
public class LinkedListFunctions<T> {
    public LinkedList<T> removeDuplicates(LinkedList<T> list){
        HashSet<T> set = new HashSet<>(list);

        return new LinkedList<>(set);
    }

    public void deleteMiddleElement(LinkedList<T> list){
        int middle = 0;

        for(T value: list)
            middle++;

        middle = middle / 2;

        list.remove(middle);
    }

    public int sumLinkedListValuesReverse(LinkedList<Integer> list1, LinkedList<Integer> list2){
        int num1 = getNumberReverse(list1);
        int num2 = getNumberReverse(list2);

        return num1 + num2;
    }

    public int sumLinkedListValues(LinkedList<Integer> list1, LinkedList<Integer> list2){
        return getNumber(list1) + getNumber(list2);
    }

    private int getNumber(LinkedList<Integer> list){
        StringBuilder sb = new StringBuilder();

        list.iterator().forEachRemaining(i ->sb.append(i));

        return stringToInt(sb.toString());
    }

    private int getNumberReverse(LinkedList<Integer> list){
        StringBuilder sb = new StringBuilder();

        list.descendingIterator().forEachRemaining(i->sb.append(i));

        return stringToInt(sb.toString());
    }

    private int stringToInt(String s){
        int results = 0;
        int decPos = 1;
        char[] array = s.toCharArray();

        for(int i = array.length - 1; i >=0; i--){
            int value = (array[i] - '0');
            results += (value * decPos);
            decPos *= 10;
        }

        return results;
    }

}
