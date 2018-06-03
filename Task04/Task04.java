import Stack.*;

public class Task04 {

    public static void main(String[] args) {
        //T1
        System.out.printf("Let's throw a coin! \nAnd result is %s", HoT.throwCoin());
        System.out.printf("For 1000 time it will be %d Heads and %d Tails\n\n", HoT.countHeads(), HoT.countTails());
        //T2.1
        int n = 496;
        System.out.printf("The max numeral of number %d is %d\n\n", n, StackOfTasks.findMax(n));
        //T2.2
        System.out.printf("The number %d is palendrom? -%b\n\n", n, StackOfTasks.isPalendrom(n));
        //T2.3
        System.out.printf("The number %d is simple? -%b\n\n", n, StackOfTasks.isSimple(n));
        //T2.4
        System.out.printf("All simple divisors of number %d are: \n\n", n);
        StackOfTasks.findDividers(n);
        //T2.5.1
        int a = 4545;
        int b = 20;
        System.out.printf("The greatest common divisor of %d and %d is %d\n\n", a, b, StackOfTasks.getGCD(a, b));
        //T2.5.2
        System.out.printf("The lowest common multiple of %d and %d is %d\n\n", a, b, StackOfTasks.getLCM(a, b));
        //T2.6
        System.out.printf("Amount of different digits of %d is %d\n\n", a, StackOfTasks.countDiferences(a));
        //T3
        System.out.printf("The number %d is perfect? -%b\n\n", n, Perfect.isPerfect(n));


    }
}
