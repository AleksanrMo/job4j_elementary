package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {

        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        return max(up, max(left, right));
    }

    public static int max(int left, int right, int up, int down) {
        return max(down, max(left, right, up));
    }
}
