package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {

        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas15Then3() {

        int[] data = {3, 2, 7, 15};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas15Then6() {

        int[] data = {3, 2, 15, 2};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}