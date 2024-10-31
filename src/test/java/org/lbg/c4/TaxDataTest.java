package org.lbg.c4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxDataTest {
    @Test
    public void verify_calculateTotal_returns_double_to_2dp() {
        TaxData cut = new TaxData(0.2, 1.5, 1);
        Double expected = 1.8;
        Double actual = cut.calculateTotal();
        assertEquals(expected, actual);
    }
}