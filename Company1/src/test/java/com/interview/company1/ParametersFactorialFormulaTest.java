package com.interview.company1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ParametersFactorialFormulaTest {
    @Parameterized.Parameter(0)
    public int m;

    @Parameterized.Parameter(1)
    public int r;

    @Parameterized.Parameter(2)
    public BigInteger expectedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0, BigInteger.valueOf(1)},
                {1, 1, BigInteger.valueOf(1)},
                {10, 10, BigInteger.valueOf(1)},
                {2, 1, BigInteger.valueOf(2)},
                {10, 5, BigInteger.valueOf(252)}
        });
    }

    @Test
    public void formula_with_factorial() throws Exception {
        FactorialFormula factorialFormula = new FactorialFormula();
        assertEquals(expectedResult, factorialFormula.formula(m, r));
    }
}