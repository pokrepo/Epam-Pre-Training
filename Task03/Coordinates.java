package Stack;

public class Coordinates {
    public static boolean isVertex(int[][] a){
        int flag;
        flag = (a[0][0] - a[2][0]) * (a[1][1] - a[2][1]) - (a[1][0] - a[2][0]) * (a[0][1] - a[2][1]);
        return flag != 0;
    }
    public static boolean isRight(int[][] a){
        double p1;
        double p2;
        double p3;

        //p1, p2, p3 --> sides

        p1 = Math.sqrt((a[1][0]-a[0][0])*(a[1][0]-a[0][0])+(a[1][1]-a[0][1])*(a[1][1]-a[0][1]));
        p2 = Math.sqrt((a[2][0]-a[0][0])*(a[2][0]-a[0][0])+(a[2][1]-a[0][1])*(a[2][1]-a[0][1]));
        p3 = Math.sqrt((a[2][0]-a[1][0])*(a[2][0]-a[1][0])+(a[2][1]-a[1][1])*(a[2][1]-a[1][1]));

        //Squares of sides

        p1 = Math.round(p1 * p1);
        p2 = Math.round(p2 * p2);
        p3 = Math.round(p3 * p3);

        //Pifagor's theorem

        return ((p1 == p2+p3) || (p2 ==p1+p3) || (p3 == p1+p2));
    }
}
