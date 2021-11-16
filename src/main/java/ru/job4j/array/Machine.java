package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int coinsIndex = 0;
        int delta = money - price;
        while (delta > 0) {
            if (delta >= coins[coinsIndex]) {
                rsl[size] = coins[coinsIndex];
                delta -= coins[coinsIndex];
                size++;
            } else {
                coinsIndex++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
