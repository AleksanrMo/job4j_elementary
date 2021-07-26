package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {

                for (int i = 0; i < array.length / 2; i++) {
                    int sum = i + 1;
                    int temp = array[i];
                    array[i] = array[array.length - sum];
                    array[array.length - sum] = temp;
                }
        return array;
    }
}
