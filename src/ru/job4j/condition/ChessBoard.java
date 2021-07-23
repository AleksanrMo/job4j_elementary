package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (((x1 + y1) == (x2 + y2)) || ((x1 + y2) == (x2 + y1))) {
            rsl = Math.abs(x2 - x1);
        }
        if (rsl > 7 || rsl == 0 || x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) {
            rsl = 0;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ChessBoard.way(6, 7, 1, 2));
    }
}
