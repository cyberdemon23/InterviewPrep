package jordan.sorting;

/**
 * Created by jordandukes on 7/8/17.
 */
public class QuickSort {
    public static void sort(int[] array){
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right){
        //partition and get a pivot
        int index = partition(array, left, right);

        if(left < index - 1)
            sort(array, left, index-1);

        if(index < right){
            sort(array, index, right);
        }
    }

    private static int partition(int[] array, int left, int right){
        //pick a value to pivot around
        int pivot = array[(left + right) / 2];

        //find a left and right element that should be swapped
        while(left <= right){
            while(array[left] < pivot) left++;

            while(array[right] > pivot) right--;

            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


}
