package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int array: array) {
            System.out.println(array);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
//. Код ниже содержит ошибку. Код должен вывести на экран массив, который мы передали в метод to(...).

   //     Метод to(..) должен записать аргумент array в поле класса.