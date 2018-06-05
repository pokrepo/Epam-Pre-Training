package pokrepo;

public class Perfect {
    public static boolean isPerfect (int n){
        final int ZERO_POINT = 0;
        final int MIN_DIVISOR = 1;
        int counter = ZERO_POINT;

        for (int i = MIN_DIVISOR; i < n; i++) {
            if (n % i == ZERO_POINT) counter += i;
        }

        return n == counter;
    }
}
