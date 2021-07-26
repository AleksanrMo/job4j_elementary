package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == pref[i]) {
                result = true;
                if (i == pref.length - 1) {
                    break;
                } else {
                    result = false;
                }
            }

        }
        return result;
    }

}