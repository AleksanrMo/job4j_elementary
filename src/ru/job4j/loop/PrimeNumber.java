package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 1;
        for (int number = finish; number > 1; number--) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}