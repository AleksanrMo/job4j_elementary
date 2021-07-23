package ru.job4j.loop;

public class Counter {

    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i < b; i++) {
           result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }
}

