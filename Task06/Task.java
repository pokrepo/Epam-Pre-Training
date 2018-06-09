public class Task {
    public static int getMax(int[][] a){
        int max = a[0][0];
        for (int[] anArray : a){
            for (int i : anArray){
                if (i > max) max = i;
            }
        }
        return max;
    }
    public static int getMin(int[][] a){
        int min = a[0][0];
        for (int[] anArray : a){
            for (int i : anArray){
                if (i < min) min = i;
            }
        }
        return min;
    }
    public static double getArithmeticalMean(int[][] a){
        int sum = 0;
        int counter = 0;
        for (int[] anArray : a){
            for (int i : anArray){
                sum += i;
                counter++;
            }
        }
        return (double) sum / counter;
    }
    private static boolean isPositive(int[][] a){
        for (int[] anArray : a){
            for (int i : anArray){
                if (i < 0) return false;
            }
        }
        return true;
    }
    public static double getGeometricalMean(int[][] a){
        if (!isPositive(a)) return -1;
        double mult = 1;
        int counter = 0;
        for (int[] anArray : a){
            for (int i : anArray){
                mult *= i;
                counter++;
            }
        }
        return Math.pow(mult, (double) 1 / counter);
    }
    public static int[] getIndexOfFirstLocalMaximum(int[][] a){
        int[] output = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (i == 0) {
                    output[0] = i;
                    if (j == 0){
                        if ((a[i][j] > a[i][j+1]) & (a[i][j] > a[i+1][j])) {
                            output[1] = j;
                            return output;
                        }
                    } else if (j < a[i].length - 1){
                        if ((a[i][j] > a[i][j-1])
                                & (a[i][j] > a[i][j+1])
                                & (a[i][j] > a[i+1][j])){
                            output[1] = j;
                            return output;
                        }
                    } else if ((a[i][j] > a[i][j-1]) & (a[i][j] > a[i+1][j])){
                        output[1] = j;
                        return output;
                    }
                } else if (i < a.length - 2){ //minus 2 to achieve pre-last array
                    if (j == 0){
                        if ((a[i][j] > a[i][j+1])
                                & (a[i][j] > a[i+1][j])
                                & (a[i][j] > a[i-1][j])){
                            output[1] = j;
                            return output;
                        }
                    } else if (j < a.length - 2){
                        if ((a[i][j] > a[i][j+1])
                                & (a[i][j] > a[i+1][j])
                                & (a[i][j] > a[i-1][j])
                                & (a[i][j] > a[i][j-1])) {
                            output[1] = j;
                            return output;
                        }
                    } else if ((a[i][j] > a[i][j-1])
                            & (a[i][j] > a[i+1][j])
                            & (a[i][j] > a[i-1][j])) {
                        output[1] = j;
                        return output;
                    }
                } else if (j == 0){
                    if ((a[i][j] > a[i][j+1]) & (a[i][j] > a[i-1][j])) {
                        output[1] = j;
                        return output;
                    }
                } else if (j < a[i].length - 1){
                    if ((a[i][j] > a[i][j-1])
                            & (a[i][j] > a[i][j+1])
                            & (a[i][j] > a[i-1][j])){
                        output[1] = j;
                        return output;
                    }
                } else if ((a[i][j] > a[i][j-1]) & (a[i][j] > a[i-1][j])){
                    output[1] = j;
                    return output;
                }
            }
        }
        output[0] = -1;
        output[1] = -1;
        return output;
    }
    public static int[] getIndexOfFirstLocalMinimum(int[][] a){
        int[] output = new int[2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (i == 0) {
                    output[0] = i;
                    if (j == 0){
                        if ((a[i][j] < a[i][j+1]) & (a[i][j] < a[i+1][j])) {
                            output[1] = j;
                            return output;
                        }
                    } else if (j < a[i].length - 1){
                        if ((a[i][j] < a[i][j-1])
                                & (a[i][j] < a[i][j+1])
                                & (a[i][j] < a[i+1][j])){
                            output[1] = j;
                            return output;
                        }
                    } else if ((a[i][j] < a[i][j-1]) & (a[i][j] < a[i+1][j])){
                        output[1] = j;
                        return output;
                    }
                } else if (i < a.length - 2){ //minus 2 to achieve pre-last array
                    if (j == 0){
                        if ((a[i][j] < a[i][j+1])
                                & (a[i][j] < a[i+1][j])
                                & (a[i][j] < a[i-1][j])){
                            output[1] = j;
                            return output;
                        }
                    } else if (j < a.length - 2){
                        if ((a[i][j] < a[i][j+1])
                                & (a[i][j] < a[i+1][j])
                                & (a[i][j] < a[i-1][j])
                                & (a[i][j] < a[i][j-1])) {
                            output[1] = j;
                            return output;
                        }
                    } else if ((a[i][j] < a[i][j-1])
                            & (a[i][j] < a[i+1][j])
                            & (a[i][j] < a[i-1][j])) {
                        output[1] = j;
                        return output;
                    }
                } else if (j == 0){
                    if ((a[i][j] < a[i][j+1]) & (a[i][j] < a[i-1][j])) {
                        output[1] = j;
                        return output;
                    }
                } else if (j < a[i].length - 1){
                    if ((a[i][j] < a[i][j-1])
                            & (a[i][j] < a[i][j+1])
                            & (a[i][j] < a[i-1][j])){
                        output[1] = j;
                        return output;
                    }
                } else if ((a[i][j] < a[i][j-1]) & (a[i][j] < a[i-1][j])){
                    output[1] = j;
                    return output;
                }
            }
        }
        output[0] = -1;
        output[1] = -1;
        return output;
    }
    public static int[][] toTransposeArray(int[][] a) {
        int[][] newArray = new int[a[0].length][a.length];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = a[j][i];
            }
        }
        return newArray;
    }
    public static int[][] toTransposeSquareArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                if (i != j) {
                    a[i][j] ^= a[j][i];
                    a[j][i] ^= a[i][j];
                    a[i][j] ^= a[j][i];
                }
            }
        }
        return a;
    }

}
