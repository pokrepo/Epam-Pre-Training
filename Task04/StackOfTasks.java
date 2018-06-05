package pokrepo;

public class StackOfTasks {
    private static final int ZERO_POINT = 0;
    public static int findMax(int n) {
        final int TEN_DIVISOR = 10;
        int max = n % TEN_DIVISOR;

        for (int i = ZERO_POINT; i < Integer.toString(n).length(); i++) {
            if (max < n % TEN_DIVISOR) max = n % TEN_DIVISOR;
            n /= TEN_DIVISOR;
        }
        return max;
    }
    public static boolean isPalendrom (int n) {
        String st = Integer.toString(n);
        int i = 0;
        int j = st.length()-1; // minusing one we need to get last element

        while ((i != j) & (i < j)) {
            if (st.charAt(i) == st.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean isSimple (int n) {
        final int MIN_SIMPLE = 2;
        for (int i = MIN_SIMPLE; i < n; i++) {
            if (n % i == ZERO_POINT) {
                return false;
            }
        }
        return true;
    }
    public static void findDividers (int n) {
        for (int i = 1; i < n; i++) { // i = 1, because dividing by ZERO_POINT lead to exception
            if ((n % i == ZERO_POINT) & (StackOfTasks.isSimple(i))) System.out.print(i+" ");
        }
    }
    public static int getGCD (int a, int b) {
        int i;
        while (b != ZERO_POINT) {
            i = b;
            b = a % b;
            a = i;
        }
        return a;
    }
    public static int getLCM (int a, int b) {
        return a * b / getGCD(a, b);
    }
    public static int countDiferences (int a){
        String st = Integer.toString(a);
        int counter = ZERO_POINT;
        final int STEP = 1;

        for (int i = ZERO_POINT; i < st.length(); i++) {
            for (int j = i + STEP; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    counter++;
                    break;
                }
            }
        }
        return st.length() - counter;
    }
}
