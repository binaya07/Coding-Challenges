import codingchallenges.Prime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    public void testIsPrime() {
        assertFalse(Prime.isPrime(1));
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(11));
        assertFalse(Prime.isPrime(15));
        assertFalse(Prime.isPrime(100));
    }

    @Test
    public void testIsPrimeUsingHalfIteration() {
        assertFalse(Prime.isPrimeUsingHalfIteration(1));
        assertTrue(Prime.isPrimeUsingHalfIteration(2));
        assertTrue(Prime.isPrimeUsingHalfIteration(3));
        assertTrue(Prime.isPrimeUsingHalfIteration(11));
        assertFalse(Prime.isPrimeUsingHalfIteration(15));
        assertFalse(Prime.isPrimeUsingHalfIteration(100));
    }

    @Test
    public void testIsPrimeUsingSquareRoot() {
        assertFalse(Prime.isPrimeUsingSquareRoot(1));
        assertTrue(Prime.isPrimeUsingSquareRoot(2));
        assertTrue(Prime.isPrimeUsingSquareRoot(3));
        assertTrue(Prime.isPrimeUsingSquareRoot(11));
        assertFalse(Prime.isPrimeUsingSquareRoot(15));
        assertFalse(Prime.isPrimeUsingSquareRoot(100));
    }
}
