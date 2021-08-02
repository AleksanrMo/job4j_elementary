package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {

        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        int rsl = max(left, right);
        return max(up, rsl);
    }

    public static int max(int left, int right, int up, int down) {
        int rsl = max(left, right, up);
        return max(down, rsl);
    }
}
