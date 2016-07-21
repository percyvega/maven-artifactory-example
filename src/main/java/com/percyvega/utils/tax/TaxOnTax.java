package com.percyvega.utils.tax;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pvega on 3/1/2016.
 */
public abstract class TaxOnTax
{
    private static Logger LOGGER = LogManager.getLogger();

    public static BigDecimal calculate(BigDecimal price, BigDecimal taxRate)
    {
        String amount = "  100.0  ";
        amount = StringUtils.deleteWhitespace(amount);

        BigDecimal divisor = BigDecimal.ONE.subtract(
                taxRate.divide(new BigDecimal(amount), 15, RoundingMode.HALF_UP));

        BigDecimal result = price.divide(divisor, 15, RoundingMode.HALF_UP);
        LOGGER.debug("Result: {}", result);

        return result;
    }
}