package com.interview.company1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FactorialFormula {
    private Map<Integer, BigInteger> cache;

    public FactorialFormula() {
        this.cache = new HashMap<>();
    }

    private BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalStateException("Factorial: n has to be >= 0, but was " + number);
        }
        BigInteger fb = BigInteger.ONE;

        if (number < 2) {
            return BigInteger.ONE;
        }

        if (cache.containsKey(number)) {
            return cache.get(number);
        }

        for (int i = 1; i <= number; i++) {
            fb = fb.multiply(BigInteger.valueOf(i));
            cache.put(i, fb);
        }
        return fb;
    }

    public BigInteger formula(int m, int r) {
        if (m < r) {
            throw new IllegalStateException("Illegal state, m = " + m + " less and not equal r = " + r);
        }
        BigInteger numerator = factorial(m);
        BigInteger denominator = factorial(r).multiply(factorial(m - r));
        return numerator.divide(denominator);
    }
}
