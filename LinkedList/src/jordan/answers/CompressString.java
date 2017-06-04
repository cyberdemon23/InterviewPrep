package jordan.answers;

/**
 * Created by Jordan on 6/3/2017.
 */
public final class CompressString {
    public static String compress(String string){
        char[] array = string.toCharArray();
        char current = array[0];
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(char c: array){
            if(current == c)
                count++;
            else{
                sb.append(current);
                sb.append(count);
                count = 1;
                current = c;
            }
        }

        sb.append(current).append(count);

        return sb.toString();
    }
}
