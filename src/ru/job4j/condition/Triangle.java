package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && bc + ac > ab;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(4, 2, 2));
    }
}
