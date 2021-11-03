package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double difAndQuotient(double first, double second) {
        return difference(first, second) + quotient(first, second);
    }

    public static double allOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + quotient(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAndQuotient(10, 20));
        System.out.println("Результат расчета равен: " + allOperations(10, 20));
    }
}