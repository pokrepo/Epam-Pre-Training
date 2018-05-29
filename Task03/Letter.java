package Stack;

public class Letter {
    public static boolean isVowel1(char c) {
        char[] array = {'e', 'y', 'u', 'i', 'o', 'a', 'E', 'Y', 'U', 'I', 'O', 'A'};
        boolean flag = false;
        for (int i = 0; i < 12; i++) {
            if (c == array[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isVowel2(char c) {
        String st = "eyuioaEYUIOA";

        boolean flag = false;
        for (int i = 0; i < 12; i++) {
            if (c == st.charAt(i)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isVowel3(char c) {
        String st = "eyuioaEYUIOA";

        return !st.replace(c, ' ').equals(st);
    }

    public static boolean isVowel4(char c) {
        String st = "eyuioaEYUIOA";
        return st.contains(c + "");
    }

}
