import pokrepo.Task;

public class Task05 {
    public static void main(String[] args) {
        int[] array = {5, 13, 12, 10, 5, 15};
        System.out.print("Source array is: ");
        Task.toPrint(array);
        //T1
        System.out.printf("\n\nThe max element of array is %d and min is %d\n\n", Task.findMax(array),
                 Task.findMin(array));
        //T2
        System.out.printf("The arithmetic mean of array is: %f\n", Task.findArithmeticMean(array));
        System.out.printf("The geometric mean of array is: %f\n\n", Task.findGeometricMean(array));
        //T3
        System.out.print("Array is sorted? "+Task.isSorted(array)+"\n\n");
        //T4
        System.out.printf("The index of first local max is %d\n", Task.findIndexOfFirstLocalMax(array));
        System.out.printf("The index of first local min is %d\n\n", Task.findIndexOfFirstLocalMin(array));
        //T5
        System.out.printf("Reversed array is: ");
        Task.toPrint(Task.toReverseArray(array));


    }


}
