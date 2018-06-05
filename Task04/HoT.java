package pokrepo;

import java.util.Random;

public class HoT {
    public static String throwCoin() {
        if (new Random().nextBoolean()) return  "Head";
        else return "Tail";
    }
    private static final int MAX_AMOUNT = 1000;
    private static final int MIN_AMOUNT = 0;

    public static int countHeads (){
        int sum = 0;

        for (int i = MIN_AMOUNT; i < MAX_AMOUNT; i++) {
            if (HoT.throwCoin().equals("Head")) sum++;
        }
        return sum;
    }

    public static int countTails () {
        int sum = 0;

        for (int i = MIN_AMOUNT; i < MAX_AMOUNT; i++) {
            if (HoT.throwCoin().equals("Tail")) sum++;
        }
        return sum;
    }
}
