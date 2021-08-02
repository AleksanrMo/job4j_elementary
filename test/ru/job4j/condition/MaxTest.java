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
    public void  whenEqual() {
        int left = 6;
        int right = 6;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenUpMaxFor3() {
        int left = 6;
        int right = 6;
        int up = 12;
        int result = Max.max(left, right, up);
        int expected = 12;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenRightMax3() {
        int left = 1;
        int right = 2;
        int up = 0;
        int result = Max.max(left, right, up);
        int expected = 2;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenLeftMaxFor3() {
        int left = 78;
        int right = 56;
        int up = 22;
        int result = Max.max(left, right, up);
        int expected = 78;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenEqualsFor3() {
        int left = 9;
        int right = 9;
        int up = 9;
        int result = Max.max(left, right, up);
        int expected = 9;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenDownMaxFor4() {
        int left = 1;
        int right = 2;
        int up = 1;
        int down = 4;
        int result = Max.max(left, right, up, down);
        int expected = 4;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenLeftMaxFor4() {
        int left = 78;
        int right = 56;
        int up = 3;
        int down = 43;
        int result = Max.max(left, right, up, down);
        int expected = 78;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenRightMaxFor4() {
        int left = 8;
        int right = 56;
        int up = 7;
        int down = 11;
        int result = Max.max(left, right, up, down);
        int expected = 56;
        Assert.assertEquals(result, expected);

    }

    @Test
    public void  whenEqualFor4() {
        int left = 43;
        int right = 43;
        int up = 43;
        int down = 43;
        int result = Max.max(left, right, up, down);
        int expected = 43;
        Assert.assertEquals(result, expected);

    }

}