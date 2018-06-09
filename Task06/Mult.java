import java.util.Random;

public class Mult {
    public static int[][] toFill(int[][] a, int min, int max){
        for (int[] anArray : a) {
            for (int i = 0; i < anArray.length; i++) {
                anArray[i] = new Random().nextInt(max - min + 1) + min;
            }
        }
        return a;
    }
    public static void toView(int[][] a){
        for (int[] anArray : a) {
            System.out.print("\n");
            for (int i : anArray) {
                System.out.print(i + " ");
            }
        }
    }
}
