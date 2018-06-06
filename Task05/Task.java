package pokrepo;


import java.util.Arrays;

public class Task {
    private static final int ZERO_POINT = 0;
    private static final int STEP = 1;
    public static int findMax (int[] a){
        int max = a[0];
        for (int i : a) {
            if (max < i) max = i;
        }
        return max;
    }
    public static int findMin (int[] a){
        int min = a[0];
        for (int i : a) {
            if (min > i) min = i;
        }
        return min;
    }
    private static double findMult (int[] a){
        int mult = 1;
        for (int i : a){
            mult *= i;
        }
        return mult;
    }
    public static double findArithmeticMean (int[] a){
        return (double) Arrays.stream(a).sum() / a.length;
    }
    private static boolean isPositive (int[] a){
        for (int i : a){
            if (i < 1) return false;
        }
        return true;
    }
    public static double findGeometricMean (int[] a){
        return isPositive(a) ? Math.pow(findMult(a), (double) 1/a.length) : -1;
    }
    private static boolean isSortedByGrow (int[] a){
        for (int i = ZERO_POINT; i < a.length-1; i++) { //minus two to keep i in frame of the array
            if (a[i] < a[i+STEP]) return false;
        }
        return true;
    }
    private static boolean isSortedByWane (int[] a){
        for (int i = ZERO_POINT; i < a.length-1; i++) { //minus two to keep i in frame of the array
            if (a[i] > a[i+STEP]) return false;
        }
        return true;
    }
    public static boolean isSorted (int[] a){
        return isSortedByGrow(a) || isSortedByWane(a);
    }
    public static int findIndexOfFirstLocalMax (int[] a){
        int index = -1;
        if (a[ZERO_POINT] > a[ZERO_POINT+STEP]) index = ZERO_POINT;
            else {
            for (int i = 1; i < a.length - 1; i++) {
                if ((a[i] > a[i - STEP]) && (a[i] > a[i + STEP])) return i;
            }
            if (a[a.length - 1] > a[a.length - 1 - STEP]) index = a.length - 1;
        }
        return index;
    }
    public static int findIndexOfFirstLocalMin (int[] a){
        int index = -1;
        if (a[ZERO_POINT] < a[ZERO_POINT+STEP]) index = ZERO_POINT;
        else {
            for (int i = 1; i < a.length - 1; i++) {
                if ((a[i] < a[i - STEP]) && (a[i] < a[i + STEP])) return i;
            }
            if (a[a.length - 1] < a[a.length - 1 - STEP]) index = a.length - 1;
        }
        return index;
    }
    public static int[] toReverseArray (int[] a){
        int cell;
        for (int i = 0, j = a.length-1; i < j; i++, j--){
            cell=a[i];
            a[i]=a[j];
            a[j]=cell;
        }
        return a;
    }
    public static void toPrint (int[] a){
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

}
