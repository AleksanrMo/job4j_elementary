package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
       int[][] multipleTable = new int[size + 1][size + 1];
        for (int row = 1; row < multipleTable.length; row++) {
            for (int cell = 1; cell < multipleTable[row].length; cell++) {
                multipleTable[row][cell] = row * cell;

            }
        }
       return multipleTable;
    }
}
