package jordan.arraygarbage;
/**
 * Created by Jordan on 5/30/2017.
 */
public final class SortFunctions {
    public static void quickSort(int[] array, int low, int high){
        if (low < high)
        {
        /* pi is partitioning index, arr[p] is now
           at right place */
            int pi = partition(array, low, high);

            quickSort(array, low, pi - 1);  // Before pi
            quickSort(array, pi + 1, high); // After pi
        }
    }

    private static int partition(int[] array, int low, int high){
        //set our pivot to the last element in the array
        int pivot = array[high];

        //declare our trailing smaller element
        int i = (low - 1);

        //declare our iterator
        int j = low;

        //iterate through the array
        while(j < high){
            //if our item is less than or equal to the pivot value increment i and swap
            //this keeps track of the last known value that was <= our pivot value
            if(array[j] <= pivot){
                i++;
                swap(array, i, j);
            }

            j++;
        }

        //finally this will move our pivot value to the appropriate location in the array
        swap(array, i + 1, high);

        return i + 1;
    }

    public static void mergeSort(int[] array){
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length -1);
    }

    private static void mergeSort(int[] array, int[] helper, int low, int high){
        if(low < high){
            //find the mid point
            int middle = (low + high) / 2;

            //perform the sort on the left elements
            mergeSort(array, helper, low, middle);

            //perform the sort on the right elements
            mergeSort(array, helper, middle + 1, high);

            //finally merge the two sections
            merge(array, helper, low, middle, high);
        }
    }

    public static void merge(int [] array, int[] helper, int low, int middle, int high){
        //copy both halves into the helper array
        for(int i = low; i <= high; i++){
            helper[i] = array[i];
        }

        //iterate through the left and right half of the helper array swapping as needed
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while(helperLeft <= middle && helperRight <= high){
            if(helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft++;
            }
            else{
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for(int i = 0; i <= remaining; i++){
            array[current + i] = helper[helperLeft + i];
        }
    }

    public static void bubbleSort(int[] array){
        int arrayLength = array.length;
        boolean cleanPass = false;

        while(!cleanPass){
            cleanPass = true;
            int i = 1;
            int j = 0;

            while(i < arrayLength){
                if(array[i] < array[j]){
                    swap(array, i , j);
                    cleanPass = false;
                }
                i++;
                j++;
            }
        }
    }

    public static void selectionSort(int[] array){
        int currentPosition = 0;

        while(currentPosition < array.length) {
            int currentLowestValue = array[currentPosition];
            int currentLowestIndex = currentPosition;

            //find the lowest value by looping through all available indexes
            for (int i = currentPosition; i < array.length; i++) {
                 if(array[i] < currentLowestValue){
                     currentLowestValue = array[i];
                     currentLowestIndex = i;
                 }
            }

            //now we have the lowest value... swap it
            swap(array, currentPosition, currentLowestIndex);
            currentPosition++;
        }
    }

    public static void sortedMerge(int[] firstArray, int[] secondArray){
        int helperLeft = 0;
        int helperRight = 0;
        int[] helper = new int[firstArray.length];
        int current = 0;

        //iterate through both arrays and copy the values over in order
        while(helperLeft < firstArray.length && helperRight < secondArray.length){
            //hack for default empty int arrays defaulting to 0
            if(firstArray[helperLeft] == 0)
                break;

            if(firstArray[helperLeft] <= secondArray[helperRight]){
                helper[current] = firstArray[helperLeft];
                helperLeft++;
            }
            else{
                helper[current] = secondArray[helperRight];
                helperRight++;
            }

            current++;
        }

        //Determine if we have any remaining array to copy
        int rightRemaining = secondArray.length - helperRight;

        //copy the remaining array values
        if(rightRemaining > 0){
            for(int i = helperRight; i < secondArray.length; i++){
                helper[current] = secondArray[i];
                current++;
            }
        }
        else{
            for(int i = helperLeft; current < helper.length; i++){
                helper[current] = firstArray[i];
                current++;
            }
        }

        //copy to the given first array
        for(int i = 0; i < helper.length; i++){
            firstArray[i] = helper[i];
        }
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array){
        int length = array.length;
        for(int j = 0; j < length; j++){
            System.out.print(array[j] + " ");
        }
    }
}
