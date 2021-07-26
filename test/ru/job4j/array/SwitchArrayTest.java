package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SwitchArrayTest {

    @Test
    public void swapArrayTest() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, source, dest);
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void swapArrayTestCenter() {
        int[] input = {1, 2, 3, 4};
        int source = 1;
        int dest = 2;
        int[] expected = {1, 3, 2, 4};
        int[] result = SwitchArray.swap(input, source, dest);
        Assert.assertArrayEquals(expected, result);

    }

}