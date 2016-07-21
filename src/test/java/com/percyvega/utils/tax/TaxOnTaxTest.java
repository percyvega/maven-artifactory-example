package com.percyvega.utils.tax;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TaxOnTaxTest {

    BigDecimal price;
    BigDecimal taxRate;
    BigDecimal closeToResult;
    final BigDecimal MARGIN_OF_ERROR = new BigDecimal(".0013");

    @Before
    public void setUp() throws Exception {
        price = new BigDecimal("10.00");
        taxRate = new BigDecimal("4.50");
        closeToResult = new BigDecimal("10.47");
    }

    @Test
    public void testCalculate() throws Exception {
        assertThat(TaxOnTax.calculate(price, taxRate), closeTo(closeToResult, MARGIN_OF_ERROR));
    }
}
