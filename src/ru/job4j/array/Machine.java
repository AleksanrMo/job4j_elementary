package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int change = money - price;
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            size += 1;
            if (change  >= 10) {
                change -= 10;
                rsl[i] = 10;
                continue;
            }
            if (change >= 5) {
                change -= 5;
                rsl[i] = 5;
                continue;
            }
            if (change >= 2) {
                change -= 2;
                rsl[i] = 2;
                continue;
            }
            if (change  >= 1) {
                change -= 1;
                rsl[i] = 1;

            } else {
                break;
            }
        }
        return Arrays.copyOf(rsl, size - 1);
    }

}
