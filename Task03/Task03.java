import Stack.*;

public class Task03 {
    public static void main(String[] args) {
        //T1
        int[][] array = {{0,0}, {2,0}, {0,6}};
        View.print("Dots are triangle? "+Coordinates.isVertex(array)+"\n");
        if (Coordinates.isVertex(array)) {
            View.print("Triangle are right? "+Coordinates.isRight(array)+"\n\n");
        }
        //T2
        int N = 356;
        View.print("Amount of heads of "+N+"-years old Dragon is "+Dragon.getHeads(N)+"\n\n");
        //T3
        char c = 'e';
        View.print(c+ " is Vowel? "+ Letter.isVowel1(c)+"\n");
        View.print(c+ " is Vowel? "+ Letter.isVowel2(c)+"\n");
        View.print(c+ " is Vowel? "+ Letter.isVowel3(c)+"\n");
        View.print(c+ " is Vowel? "+ Letter.isVowel4(c)+"\n\n");
        //T4
        View.print("Your mood now is "+MoodSensor.getMood()+"\n\n");
        //T5
        int dd = 28;
        int mm = 2;
        int yyyy = 1996;
        View.print("Today is "+dd+"."+mm+"."+yyyy+"\nTomorrow will be "+Calendar.getNextDate(dd, mm, yyyy));
    }
}
