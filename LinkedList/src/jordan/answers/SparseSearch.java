package jordan.answers;

/**
 * Created by jordandukes on 6/4/17.
 */
public final class SparseSearch {
    public static int search(String[] stringArray){
        return search(stringArray, 0, stringArray.length - 1);
    }

    private static int search(String[] stringArray, int start, int end){
        int count = 0;
        if(start == end && stringArray[start].length() > 0){
            System.out.println(String.format("Found %s", stringArray[start]));
            return count + 1;
        }
        else if(start == end)
            return count;

        int middle = (end + start) / 2;

        count += search(stringArray, start, middle);
        count += search(stringArray, middle + 1, end);

        return count;
    }

}
