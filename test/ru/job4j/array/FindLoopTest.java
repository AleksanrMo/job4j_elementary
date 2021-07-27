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
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas15ThenMinusOne() {
        int[] data = {3, 2, 2, 2};
        int el = 15;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf1(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind12() {
        int[] data = new int[] {5, 2, 10, 2, 4, 9, 21, 8};
        int el = 12;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexOf1(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind1() {
        int[] data = new int[] {5, 2, 10, 2, 4, 9, 21, 8};
        int el = 2;
        int start = 0;
        int finish = 6;
        int result = FindLoop.indexOf1(data, el, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}