package com.interview.company1;

import org.junit.Before;
import org.junit.Test;

public class FactorialFormulaTest {

    private FactorialFormula factForm;

    @Before
    public void init() throws Exception {
        factForm = new FactorialFormula();
    }

    @Test(expected = IllegalStateException.class)
    public void when_parm_r_larger_than_parm_m_then_illegalstate_exception() throws Exception {
        int m = 10;
        int r = 20;
        factForm.formula(m,r);
    }

    @Test(expected = IllegalStateException.class)
    public void when_negative_parm_for_r_then_illegalstate_exception() throws Exception {
        int m = 10;
        int r = -1;
        factForm.formula(m,r);
    }
}