package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenFactorial5Is120() {
        int n = 5;
        int expected = 120;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFactorial6Is362880() {
        int n = 9;
        int expected = 362880;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }
}