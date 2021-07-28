package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
       int[][] multipleTable = new int[size][size];
        for (int row = 0; row < multipleTable.length; row++) {
            for (int cell = 0; cell < multipleTable[row].length; cell++) {
                multipleTable[row][cell] = (row + 1) * (cell + 1);

            }
        }
       return multipleTable;
    }
}
