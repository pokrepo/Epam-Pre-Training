package Stack;

import java.util.Random;

public class HoT {
    public static String throwCoin() {
        Random coin = new Random();

        if (coin.nextBoolean()) return  "Head";
        else return "Tail";
    }

    public static int countHeads (){
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (HoT.throwCoin() == "Head") sum++;
        }
        return sum;
    }

    public static int countTails () {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if (HoT.throwCoin() == "Tail") sum++;
        }
        return sum;
    }
}
