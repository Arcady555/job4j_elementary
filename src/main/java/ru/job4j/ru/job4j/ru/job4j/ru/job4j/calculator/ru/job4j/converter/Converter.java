package ru.job4j.ru.job4j.ru.job4j.ru.job4j.calculator.ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float out = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == out;
        System.out.println("140 rubles are 2E. Test result : " + passedEuro);

        float inDollar = 180;
        float expectedDollar = 3;
        out = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == out;
        System.out.println("140 rubles are 3$. Test result : " + passedDollar);

    }
}
