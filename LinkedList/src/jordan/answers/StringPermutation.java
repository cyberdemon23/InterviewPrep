package jordan.answers;

import java.util.LinkedList;

/**
 * Created by jordandukes on 6/4/17.
 */
public final class StringPermutation {
    private  static LinkedList<String> perm1(String s) {
        LinkedList<String> results = new LinkedList<>();
        perm1("", s, results);
        return results;
    }

    private static void perm1(String prefix, String s, LinkedList<String> results) {
        int n = s.length();
        if (n == 0) results.add(prefix);
        else {
            for (int i = 0; i < n; i++)
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n), results);
        }
    }

    public static void printPermuations(String s){
        for(String string: perm1(s)){
            System.out.println(string);
        }
    }

    public static boolean isPermutation(String s1, String s2){
        return perm1(s2).contains(s1);
    }
}
