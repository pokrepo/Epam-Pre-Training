package Stack;

public class Dragon {
    public static int getHeads (int N){
        int sum;
        if (N > 300){
            sum = N - 300 + 803;
        } else if (N > 200) {
            sum = (N - 200) * 2 + 603;
        } else sum = N * 3 + 3;
        return sum;
    }
    public static int getEyes (int N){
         return Dragon.getHeads(N) * 2;
    }
}
