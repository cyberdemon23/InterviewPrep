package jordan.math;

/**
 * Created by Jordan on 5/27/2017.
 */
public final class MathFunctions {
    public static int Add(int x, int y){
        while(y != 0){
            int carry = x & y;

            x = x ^ y;

            y = carry << 1;
        }

        return x;
    }

    public static int Sub(int x, int y){
        while(y != 0){
            int carry = x & y;

            x = x ^ y;

            y = carry >> 1;
        }

        return x;
    }
}
