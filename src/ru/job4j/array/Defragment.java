package ru.job4j.array;

public class Defragment {

        public static String[] compress(String[] array) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                    int point = index;
                    for (int j = point + 1; j < array.length; j++) {
                        if (array[j] != null) {
                            Defragment.swap1(array, point, j);
                            break;
                        }
                    }

                }
                System.out.print(array[index] + " ");
            }
            return array;
        }

        public static void main(String[] args) {
            String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
            String[] compressed = compress(input);
            System.out.println();
            for (int index = 0; index < compressed.length; index++) {
                System.out.print(compressed[index] + " ");
            }
        }

    public static  String[] swap1(String[] array, int source, int dest) {
        String temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

}

