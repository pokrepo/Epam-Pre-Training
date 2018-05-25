import java.math.BigDecimal;

class StackOfTasks {
    static void t1(int a, int b, int c) {

        System.out.printf("%d = %d = %d --> %b\n\n", a, b, c, (a == b) & (a == c));

    }
    static void t2(int k) {

        BigDecimal bd1 = new BigDecimal(k);
        BigDecimal bd2 = new BigDecimal(1000);

        System.out.printf("%d kilos are equal to:\n%f tonns;\n%d gramms;\n%d miligramms;\n\n",
                k, bd1.divide(bd2), (long) k*10000, (long) k*1000000);
    }
    static void t3(int r1, int r2){

        System.out.printf("S = PI * (R1^2 - R2^2) --> %f;\n\n", Math.PI *( r1 * r1 - r2 * r2));

    }
    static void t4(int n) {
        int a[];

        a = new int [4];

        for (int i = 0; i < 4; i++) {
            a[i] = n % 10;
            n /= 10;
        }

        System.out.printf("%d < %d < %d < %d --> %b\n\n", a[3], a[2], a[1], a[0], (((a[3] < a[2]) &
                (a[2] < a[1])) & (a[1] < a[0])));
    }
    static void t5(int N) {
        int a[];
        int al = 0, ge = 1;

        a = new int [6];

        System.out.printf("Series:");
        for (int i = 0; i <= 5; i++) {
            a[i] = N % 10;
            N /= 10;
            al += a[i];
            ge *= a[i];
            System.out.printf(" %d", a[i]);
        }

        BigDecimal BDal = new BigDecimal(al);
        BigDecimal BD6 = new BigDecimal(6.0);

        System.out.printf("\nArithmetical mean: %f;\nGeometrical mean: %f;\n\n", BDal.divide(BD6), Math.pow(ge,(float) 1 / 6));

    }
    static void t6(int N) {
        int a[];
        int sum = 0, k = 1000000;

        a = new int[7];

        System.out.printf("%d ", N);

        for (int i = 0; i <= 6; i++) {
            a[i] = N % 10;
            N /= 10;
            sum += a[i] * k;
            k /= 10;
        }

        System.out.printf("--> %d\n\n", sum);
    }
    static void t7(int n1, int n2) {

        System.out.printf("Pre: n1 = %d and n2 = %d\n", n1, n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.printf("Post: n1 = %d and n2 = %d", n1, n2);
    }
}