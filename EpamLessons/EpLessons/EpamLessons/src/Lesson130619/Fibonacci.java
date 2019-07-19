package Lesson130619;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Start...");
        long start = System.currentTimeMillis();
        System.out.println(fib2(100));
        long end = System.currentTimeMillis();
        System.out.println("Elapsed: " + (end - start));

    }

    private static long fib1(int i) {
        if (i == 1) {
            return 1;
        } //if (i <= 2) return 1; а дальше как у меня
        if (i == 2) {
            return 1;
        }
        return fib1(i - 1) + fib1(i - 2);
    }

    static long[] fib = new long[1000];

    private static long fib2(int i) {
        if (i <= 2) {
            return 1;
        }

        if (fib[i] > 0) {
            return fib[i];
        } else {
            fib[i] = fib2(i - 1) + fib2(i - 2);
            return fib[i];
        }
    }
}
