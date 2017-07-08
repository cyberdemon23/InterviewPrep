package jordan.sorting;

/**
 * Created by jordandukes on 7/8/17.
 */
public class MergeSort {
    public static void sort(int[] array){
        sort(array, new int[array.length], 0, array.length -1 );
    }

    private static void sort(int[] array, int[] helper, int low, int high){
        if(low < high) {
            //find the mid point
            int middle = (low + high) / 2;
            //sort left
            sort(array, helper, low, middle);
            //sort right
            sort(array, helper, middle + 1, high);
            //merge
            merge(array, helper, low, middle, high);
        }
    }

    private static void merge(int[] array, int[] helper, int low, int middle, int high){
        //copy array to helper
        for(int i = low; i <= high; i++)
            helper[i] = array[i];

        //declare left and right index helpers
        int left = low;
        int right = middle + 1;
        int current = low;

        //work through the left and right sections taking the lower element and putting it in the main array
        while(left <= middle && right <= high){
            if(helper[left] <= helper[right]) {
                array[current] = helper[left];
                left++;
            } else {
                array[current] = helper[right];
                right++;
            }
            current++;
        }

        //copy the remaining elements after we've exhausted left or right
        int remaining = middle - left;
        for(int i = 0; i <= remaining; i++){
            array[current+i] = helper[left+i];
        }
    }
}
