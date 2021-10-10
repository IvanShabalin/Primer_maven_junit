package com.epam.tr.task01;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    @Test
    public void test01() {
        int x = -4;
        int y = -3;
        boolean realValue;
        boolean expected = true;
        realValue = Comparison.compare(x, y);
        Assert.assertEquals(realValue, expected);
    }

    @Test
    public void test02() {
        int x = 6;
        int y = 2;
        boolean realValue;
        boolean expected = true;
        realValue = Comparison.compare(x, y);
        Assert.assertEquals(realValue, expected);
    }
}