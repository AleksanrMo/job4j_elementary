package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class MaxTest {

    @Test
    public void  whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenLeftMax() {
        int left = 78;
        int right = 56;
        int result = Max.max(left, right);
        int expected = 78;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenRightMax() {
        int left = 8;
        int right = 56;
        int result = Max.max(left, right);
        int expected = 56;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenEquals() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);

    }
}