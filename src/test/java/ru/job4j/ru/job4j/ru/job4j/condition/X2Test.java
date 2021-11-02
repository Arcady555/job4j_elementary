package ru.job4j.ru.job4j.ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        /* Входные параметра. Их будет 4 для данного случая*/
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 0;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 1;
        c = 0;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        c = 1;
        x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}