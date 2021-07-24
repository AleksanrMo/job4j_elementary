package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
       for (int i = 0; i <= number; i++) {
           if (i >= 2 && i % 2 != 0 && i == number) {
               prime = true;
              break;
           }
       }
        return prime;
    }
}
