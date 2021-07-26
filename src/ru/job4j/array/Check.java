package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean check = data[0];
             for (int i = 0; i < data.length; i++) {
               if (data[i] == check) {
                   result = true;
               } else {
                   result = false;
                   break;
               }
             }
        return result;
    }

    public static void main(String[] args) {
        boolean[] check = {true, false, true};
        System.out.println(mono(check));
    }
}
