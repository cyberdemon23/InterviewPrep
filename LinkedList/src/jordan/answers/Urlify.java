package jordan.answers;

/**
 * Created by jordandukes on 6/4/17.
 */
public final class Urlify {
    public static String urlifyString(String s){
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++){
            if(array[i] ==' '){
                //shift the array three elements to the right
                for(int k = array.length - 3; k > i; k--){
                    array[k + 2] = array[k];
                    array[k]=' ';
                }

                //replace with %20
                array[i] = '%';
                array[i + 1] = '2';
                array[i + 2] = '0';
            }
        }

        return new String(array);
    }
}
