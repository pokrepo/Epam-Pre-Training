package Stack;

public class StackOfTasks {
    public static int findMax(int n) {
        String st = Integer.toString(n);
        int max = n % 10;

        for (int i = 0; i < st.length(); i++) {
            if (max < n % 10) max = n % 10;
            n /= 10;
        }
        return max;
    }
    public static boolean isPalendrom (int n) {
        String st = Integer.toString(n);
        int i = 0;
        int j = st.length()-1;
        boolean flag = false;

        while ((i != j) & (i < j)) {
            if (st.charAt(i) == st.charAt(j)) {
                flag = true;
                i++;
                j--;

            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static boolean isSimple (int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void findDividers (int n) {
        for (int i = 1; i < n; i++) {
            if ((n % i == 0) & (StackOfTasks.isSimple(i))) System.out.print(i+" ");
        }
    }
    public static int getGCD (int a, int b) {
        int i;
        while (b != 0) {
            i = b;
            b = a % b;
            a = i;
        }
        return a;
    }
    public static int getLCM (int a, int b) {
        return a * b / getGCD(a, b);
    }
    public static int countDiferences (int a){
        String st = Integer.toString(a);
        int counter = 0;

        for (int i = 0; i < st.length(); i++) {
            for (int j = i+1; j < st.length(); j++) {
                if (st.charAt(i) == st.charAt(j)) {
                    counter++;
                    break;
                }
            }
        }
        return st.length() - counter;
    }
}
