package jordan.answers;

import java.util.HashMap;

/**
 * Created by jordandukes on 6/4/17.
 */
public final class UniqueString {
    public static boolean isUnique(String s){
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: array){
            if(map.containsKey(c))
                return false;
            else{
                map.put(c, 1);
            }
        }

        return true;
    }

    public static boolean uniqueStringNoHash(String s){
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++){
            for(int k = 1; k < array.length; k++){
                if(array[i] == array[k] && i != k)
                    return false;
            }
        }

        return true;
    }
}
