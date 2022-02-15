package codingchallenges;

import java.util.HashMap;

public class Fibonacci {

    private static HashMap<Integer, Long> fibonacciSeries = new HashMap<>();

    static {
        fibonacciSeries.put(1, 1L);
        fibonacciSeries.put(2, 1L);
    }

    /**
     * Performance comparison -
     * 1. Recursion is slower than iteration.
     * 2. When using memorization(caching), in this case, as a hashmap, it is slower than normal iteration technique until the position is close to 1 million.
     *    It is because of the additional cost of checking and storing into hashmap. After that certain threshold, it will be faster than normal iteration technique.
     */
    public static void fibonacci() {
        // Fibonacci using recursion
        long startTime = System.nanoTime();
        long f1 = fibonacciRec(20);
        long stopTime = System.nanoTime();
        System.out.println("Fibonacci recursion value: " + f1 + ", time(ns) :" + (stopTime - startTime));

        // Fibonacci using iteration
        startTime = System.nanoTime();
        long f2 = fibonacciLoop(1000000);
        stopTime = System.nanoTime();
        System.out.println("Fibonacci loop value: " + f2 + ", time(ns):" + (stopTime - startTime));

        // Fibonacci using memorization
        startTime = System.nanoTime();
        long f3 = improvedFibo(1000000);
        stopTime = System.nanoTime();
        System.out.println("Fibonacci memorization value: " + f3 + ", time(ns) :" + (stopTime - startTime));

    }

    /**
     * Get the value for a particular position in a fibonacci series using recursion.
     *
     * @param position
     * @return
     */
    private static long fibonacciRec(int position) {
        if (position == 1 || position == 2) {
            return 1L;
        }
        return fibonacciRec(position - 1) + fibonacciRec(position - 2);
    }

    /**
     * Get the value for a particular position in a fibonacci series using iteration (loop).
     *
     * @param position
     * @return
     */
    private static long fibonacciLoop(int position) {
        long nMinusOneTerm = 1;
        long nMinusTwoTerm = 1;
        long value = 1;
        for (int i = 3; i <= position; i++) {
            value = nMinusOneTerm + nMinusTwoTerm;
            nMinusOneTerm = nMinusTwoTerm;
            nMinusTwoTerm = value;
        }
        return value;
    }

    /**
     * Get the value for a particular position in a fibonacci series using memorization(caching).
     *
     * @param position
     * @return
     */
    private static long improvedFibo(int position) {
        // Check HashMap if the value is already store there.
        Long cachedValue = fibonacciSeries.get(position);
        if (cachedValue != null) {
            return cachedValue;
        }
        // Calculate Fibonacci element.
        long value = fibonacciLoop(position);
        // Add the value to HashMap.
        fibonacciSeries.put(position, value);
        return value;
    }
}
