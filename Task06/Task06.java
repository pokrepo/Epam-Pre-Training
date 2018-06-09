public class Task06 {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 100;
        final int n = 5;
        final int m = 6;
        int[][] array = new int[n][m];
        int[] arrayForT3 = new int[1];
        array = Mult.toFill(array, min, max);

        //Filling and showing of array
        Mult.toView(array);
        //T1
        System.out.printf("\n\nThe max element of Array is %d\n", Task.getMax(array));
        System.out.printf("The min element of Array is %d\n\n", Task.getMin(array));
        //T2
        System.out.printf("The arithmetical mean of array is %f\n", Task.getArithmeticalMean(array));
        System.out.printf("The geometrical mean of array is %f\n\n", Task.getGeometricalMean(array));
        //T3
        System.out.print("The index of first local max in array is ");
        arrayForT3 = Task.getIndexOfFirstLocalMaximum(array);
        for (int i : arrayForT3){
            System.out.print(i+" ");
        }
        System.out.print("\nThe index of first local min in array is ");
        arrayForT3 = Task.getIndexOfFirstLocalMinimum(array);
        for (int i : arrayForT3){
            System.out.print(i+" ");
        }
        //T4
        System.out.print("\n\nTranspored array is:");
        array = Task.toTransposeArray(array);
        Mult.toView(array);
    }
}
