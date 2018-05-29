package Stack;

import java.util.Random;

public class MoodSensor {
    public static String getMood(){
        String[] pics = {":-)",";-)",":-o",":=)","{:-)",":-(",":-D",":-x",":^)"};

        Random mood = new Random();
        int i = mood.nextInt(9);

        return pics[i];
    }
}
