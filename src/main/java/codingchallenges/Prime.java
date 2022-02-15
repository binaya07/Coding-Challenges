package codingchallenges;

public class Prime {

    public static void checkPrime() {
        System.out.println("Check prime: " + isPrime(11));
        System.out.println("Check prime using half iteration: " + isPrimeUsingHalfIteration(83));
        System.out.println("Check prime using even less iteration: " + isPrimeUsingSquareRoot(19));
    }

    /**
     * A prime number is a number which is divisible by 1 and itself.
     * Ex: 3, 5, 7, 11 .... so on
     *
     * @return
     */
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * We do not need to iterate to the number itself to check for prime.
     * The number of loops can be reduced by checking only upto half of the number.
     *
     * @return
     */
    public static boolean isPrimeUsingHalfIteration(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * The number of loops can be even further reduced by checking only upto square root of the number.
     *
     * @return
     */
    public static boolean isPrimeUsingSquareRoot(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
