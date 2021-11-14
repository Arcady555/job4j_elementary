package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {3, 1, 5, 23, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 3, 5, 23};
        Assert.assertArrayEquals(expected, result);
    }
}