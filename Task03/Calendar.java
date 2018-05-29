package Stack;

public class Calendar {
    private static boolean isSextus(int yyyy) {
        boolean flag = false;
        if (yyyy % 4 == 0) {
            flag = true;
            if (yyyy % 100 == 0) {
                flag = yyyy % 400 == 0;
            }

        }
        return flag;
    }

    public static String getNextDate(int dd, int mm, int yyyy) {
        int[] month = {2, 4, 6, 9, 11, 1, 3, 5, 7, 8, 10, 12}; // [1] - 28(29) days; [2-4] - 30 days; [5-12] - 31 days

        for (int i = 0; i < 12; i++) {
            if (mm == month[i]) {
                mm = i;
                break;
            }
        }

        // next date for 30-day months

        if ((mm > 0) & (mm < 5)) {
            if (dd < 30) dd++;
            else {
                mm = month[mm] + 1;
                dd = 1;
            }
        }

        // next date for 31-day months (except December)

        if ((mm > 4) & (mm < 11)) {
            if (dd < 31) dd++;
            else {
                mm = month[mm] + 1;
                dd = 1;
            }
        }

        // next date for December

        if (mm == 11) {
            if (dd < 31) dd++;
            else {
                mm = 5;
                dd = 1;
                yyyy += 1;
            }
        }

        // next date for February

        if (mm == 0) {
            if (dd < 28) dd++;
            else if (!Calendar.isSextus(yyyy)){
                mm = 6;
                dd = 1;
            } else dd++;
        }
        return Integer.toString(dd)+"."+Integer.toString(month[mm])+"."+Integer.toString(yyyy);
    }
}
