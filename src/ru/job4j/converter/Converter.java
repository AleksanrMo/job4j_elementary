package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {

        return  value / 70;
    }

    public static float rubleToDollar(float value) {

        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euros");
        System.out.println("140 rubles are " + dollar + " dollars");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        expected = 2.33333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 dollars are 2,33333333. Test result : " + passed);

    }

}
