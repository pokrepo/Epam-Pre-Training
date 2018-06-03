package Stack;

public class Perfect {
    public static boolean isPerfect (int n){
        boolean flag = true;
        int counter = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) counter += i;
        }

        return n == counter;
    }
}
