package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
      int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
            System.out.println(numbers[i]);
        }
        System.out.println();
        for (int number: numbers) {
            System.out.println(number);

        }
    }
}
